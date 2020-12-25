package com.example.sulymka_l8_network

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


fun main() {
    val retrofit : Retrofit = Retrofit.Builder()
        .baseUrl("https://cat-fact.herokuapp.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val jsonApi : JsonApi = retrofit.create(JsonApi::class.java)

    val call : Call<List<Cat>> = jsonApi.getCatList()

    var catList : List<Cat>? = null

    call.enqueue(object : Callback<List<Cat>>{
        override fun onResponse(call: Call<List<Cat>>, response : Response<List<Cat>>) {
                catList = response.body()
        }
        override fun onFailure(call: Call<List<Cat>>, t: Throwable) {

        }
    })

    println("Downloading files...")

    var count = 0
    while (count <= 10){
        Thread.sleep(1000)
        if (catList !== null){
            catList?.forEach(::println)
            break
        }
        count++
    }
    if (catList == null)
        println("No data")
}