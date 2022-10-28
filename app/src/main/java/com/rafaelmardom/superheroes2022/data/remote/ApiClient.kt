package com.rafaelmardom.superheroes2022.data.remote

import com.rafaelmardom.superheroes2022.data.SuperHeroDataRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// RETROFIT
class ApiClient {
    private val baseURL = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/"
    private  val services: ApiServices

    init {
        services = buildServices()
    }

    private fun retrofitClient(): Retrofit = Retrofit.Builder().baseUrl(baseURL).addConverterFactory(GsonConverterFactory.create()).build()

    private fun buildServices() = retrofitClient().create(ApiServices::class.java)


    fun getSuperHeroes(): List<SuperHeroApiModel> {
        val superHeroes = services.getSuperHeroes()
        val response = superHeroes.execute()

        if (response.isSuccessful){
            return response.body()?: emptyList()
        }
        return emptyList()
    }
}