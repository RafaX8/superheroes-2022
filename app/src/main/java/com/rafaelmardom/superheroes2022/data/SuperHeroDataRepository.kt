package com.rafaelmardom.superheroes2022.data

import com.rafaelmardom.superheroes2022.data.remote.SuperHeroRemoteDataSource
import com.rafaelmardom.superheroes2022.data.remote.toDomain
import com.rafaelmardom.superheroes2022.domain.SuperHero
import com.rafaelmardom.superheroes2022.domain.SuperHeroRepository

class SuperHeroDataRepository(
    //val localSource:
    val remoteDataSource: SuperHeroRemoteDataSource
): SuperHeroRepository {

    override fun getSuperHeroes(): List<SuperHero> {
        return remoteDataSource.getSuperHeroes()
    }

}