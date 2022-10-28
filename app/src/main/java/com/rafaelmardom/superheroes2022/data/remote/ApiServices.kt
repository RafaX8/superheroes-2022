package com.rafaelmardom.superheroes2022.data.remote

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

// ENDPOINTS O SERVICIOS PARA SUPERHEROES
interface ApiServices {

    @GET("all.json")
    fun getSuperHeroesFeed(): Call<List<SuperHeroApiModel>>

    @GET("biography/{heroId}.json")
    fun getBiography(@Path("heroId") heroId: Int): Call<BiographyApiModel>

    @GET("work/{heroId}.json")
    fun getWork(@Path("heroId") heroId: Int): Call<WorkApiModel>
}