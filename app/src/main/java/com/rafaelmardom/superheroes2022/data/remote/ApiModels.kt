package com.rafaelmardom.superheroes2022.data.remote

data class SuperHeroApiModel(val id: Int, val name: String, val images: List<String>){
    fun getUrlImageS() :String= images[0]
    fun getUrlImageM() :String= images[1]
    fun getUrlImageL() :String= images[2]
    fun getUrlImageXL() :String= images[3]
}
data class BiographyApiModel(val realName: String)
data class WorkApiModel(val occupation: String)