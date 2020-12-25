package com.example.sulymka_l8_network

import retrofit2.http.GET
import retrofit2.Call

interface JsonApi {
    @GET("facts")
    fun getCatList() : Call<List<Cat>>
}