package com.rafaelmardom.superheroes2022.data.remote

import com.rafaelmardom.superheroes2022.domain.SuperHero

fun SuperHeroApiModel.toDomain(): SuperHero{
    return SuperHero(this.id, this.name, this.images)
}