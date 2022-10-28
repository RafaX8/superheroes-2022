package com.rafaelmardom.superheroes2022.data.remote

import com.rafaelmardom.superheroes2022.domain.SuperHero
import com.rafaelmardom.superheroes2022.domain.SuperHeroRepository

class SuperHeroRemoteDataSource: SuperHeroRepository {

    override fun getSuperHeroes(): List<SuperHero> {
        return ApiClient().getSuperHeroes().map {
            it.toDomain()
        }
    }
}