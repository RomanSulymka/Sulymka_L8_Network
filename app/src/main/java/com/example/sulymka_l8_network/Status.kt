package com.example.sulymka_l8_network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Status {

    @SerializedName("verified")
    @Expose
    var verified : Boolean = false

    @SerializedName("sendCount")
    @Expose
    var sendCount : Int = 1

    @SerializedName("feedback")
    @Expose
    var feedback : String = ""

    override fun toString(): String {
        return "Status(verified=$verified, sendCount=$sendCount, feedback='$feedback')"
    }
}