package com.example.projectuasdefrymaulana.services

import com.example.projectuasdefrymaulana.models.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=90815fba49dc64faccc22cbef96a0934")
    fun getTVList(): Call<TVResponse>
}