package com.rafaelmardom.superheroes2022.data.biography

import com.rafaelmardom.superheroes2022.data.remote.ApiClient
import com.rafaelmardom.superheroes2022.domain.Biography

class BiographyRemoteDataSource(private val apiClient: ApiClient) {

    fun getBiography(superHeroeId: Int): Biography? =
        apiClient.getBiography(superHeroeId)?.toDomain()
}