package com.example.sulymka_l8_network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun main() {
    val retrofit : Retrofit = Retrofit.Builder()
        .baseUrl("https://cat-fact.herokuapp.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val catApi : ApiCat? = retrofit.create(ApiCat::class.java)

    val response = catApi?.getInfoCat()?.execute()
    val catsList : List<Cat>? = response?.body()

    catsList?.forEach(::println)
}