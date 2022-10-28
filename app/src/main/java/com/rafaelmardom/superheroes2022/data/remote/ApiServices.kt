package com.rafaelmardom.superheroes2022.data.remote

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

// ENDPOINTS O SERVICIOS PARA SUPERHEROES
interface ApiServices {

    @GET ("all.json")
    fun getSuperHeroes() : Call<List<SuperHeroApiModel>>

    @GET ("id/{id}.json")
    fun getSuperHeroById(@Path("{id}") id: Int) : Call<SuperHeroApiModel>
}