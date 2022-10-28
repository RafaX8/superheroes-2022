package com.rafaelmardom.superheroes2022.domain

class GetSuperHeroesFeedUseCase(
    val superHeroRepository: SuperHeroRepository,
    val biographyRepository: BiographyRepository,
    val workRepository: WorkRepository
) {

    fun execute(): List<SuperHeroesFeed> {
        val superHeroes = superHeroRepository.getSuperHeroes()
        return superHeroes.map {
            SuperHeroesFeed(
                it.id,
                it.name,
                it.getUrlImageS(),
                biographyRepository.getBiography(it.id).realName,
                workRepository.getWork(it.id).occupation
            )
        }
    }

    // MODELO CREADO EXCLUSIVAMENTE PARA EL CASO DE USO.
    data class SuperHeroesFeed(
        val id: Int,
        val nameSuperhero: String,
        val ulrImage: String,
        val biography: String,
        val work: String
    )
}