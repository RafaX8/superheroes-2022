package com.rafaelmardom.superheroes2022.domain

interface SuperHeroRepository {
    fun getSuperHeroes(): List<SuperHero>
}

interface BiographyRepository {
    fun getBiography(superHeroID: Int): Biography
}

interface WorkRepository {
    fun getWork(superHeroID: Int): Work
}