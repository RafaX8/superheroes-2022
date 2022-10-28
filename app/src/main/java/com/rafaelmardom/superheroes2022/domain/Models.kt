package com.rafaelmardom.superheroes2022.domain

data class SuperHero(val id: Int, val name: String, val images: List<String>){
    fun getUrlImageS() :String= images[0]
    fun getUrlImageM() :String= images[1]
    fun getUrlImageL() :String= images[2]
    fun getUrlImageXL() :String= images[3]
}
data class Biography(val realName: String)
data class Work(val occupation: String)
