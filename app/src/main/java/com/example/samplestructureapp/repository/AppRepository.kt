package com.example.samplestructureapp.repository

import com.example.samplestructureapp.model.RequestBodies
import com.example.samplestructureapp.network.RetrofitInstance

class AppRepository {
    suspend fun loginUser(body: RequestBodies.LoginBody) =
        RetrofitInstance().retrofitApi?.userLoginData(body)

    suspend fun getAllListData() = RetrofitInstance().retrofitApi?.getAllListData()
    suspend fun getAllListNextData() = RetrofitInstance().retrofitApi?.getAllListNextData()
}