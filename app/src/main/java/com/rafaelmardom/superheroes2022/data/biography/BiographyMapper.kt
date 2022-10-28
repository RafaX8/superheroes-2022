package com.rafaelmardom.superheroes2022.data.biography

import com.rafaelmardom.superheroes2022.domain.Biography


fun BiographyApiModel.toDomain() = Biography(this.realName)
