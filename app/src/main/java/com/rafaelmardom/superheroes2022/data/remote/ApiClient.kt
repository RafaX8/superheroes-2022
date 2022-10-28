package com.rafaelmardom.superheroes2022.data.remote

import com.rafaelmardom.superheroes2022.data.SuperHeroDataRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// RETROFIT
class ApiClient {

    private val baseEndPoints: String =
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/"

    private val apiServices: ApiServices

    init {
        apiServices = buildApiEndPoints()
    }

    fun createRetrofitClient() = Retrofit.Builder()
        .baseUrl(baseEndPoints)
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    fun buildApiEndPoints() = createRetrofitClient().create(ApiServices::class.java)

    fun getSuperHeroes(): List<SuperHeroApiModel> {
        val superHeroes = apiServices.getSuperHeroes()
        val response = superHeroes.execute()
        if (response.isSuccessful) {
            return response.body() ?: emptyList()
        }
        return emptyList()
    }

    fun getBiography(superHeroeId: Int): BiographyApiModel? {
        val call = apiServices.getBiography(superHeroeId).execute()
        return if (call.isSuccessful) {
            call.body()
        } else {
            null
        }
    }

    fun getWork(superHeroeId: Int): WorkApiModel? {
        val call = apiServices.getWork(superHeroeId).execute()
        return call.body()
    }
}