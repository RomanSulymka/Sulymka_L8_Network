package com.example.sulymka_l8_network

import retrofit2.Call
import retrofit2.http.GET

interface ApiCat {
    @GET("facts")
    fun getInfoCat() : Call<List<Cat>>
}