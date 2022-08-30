package com.example.samplestructureapp.repository

import com.example.samplestructureapp.network.RetrofitInstance

class AppRepository {
    suspend fun getAllListData() = RetrofitInstance().retrofitApi?.getAllListData()
    suspend fun getAllListNextData() = RetrofitInstance().retrofitApi?.getAllListNextData()
}