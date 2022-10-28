package com.rafaelmardom.superheroes2022.data.biography

import com.rafaelmardom.superheroes2022.domain.Biography
import com.rafaelmardom.superheroes2022.domain.BiographyRepository

class BiographyDataRepository(val remoteDataSource: BiographyRemoteDataSource) : BiographyRepository{
    override fun getBiography(superHeroID: Int): Biography {
        return remoteDataSource.getBiography(superHeroID) ?: Biography("test")
    }
}