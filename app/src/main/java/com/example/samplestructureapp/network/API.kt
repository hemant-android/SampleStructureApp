package com.example.samplestructureapp.network

import com.example.samplestructureapp.model.response.GetMovieList
import retrofit2.Response
import retrofit2.http.GET

interface API {
    @GET("top_rated?api_key=ec01f8c2eb6ac402f2ca026dc2d9b8fd")
    suspend fun getAllListData(): Response<GetMovieList>

    @GET("top_rated?api_key=ec01f8c2eb6ac402f2ca026dc2d9b8fd&page=2")
    suspend fun getAllListNextData(): Response<GetMovieList>

}