package com.example.samplestructureapp.model.response


import com.google.gson.annotations.SerializedName

data class CommonResponse(
    @SerializedName("status") val status: Boolean, // true
    @SerializedName("message") val message: String // Login Successfull !!
)