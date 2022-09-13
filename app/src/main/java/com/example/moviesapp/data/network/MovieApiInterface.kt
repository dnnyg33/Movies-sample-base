package com.example.moviesapp.data.network

import com.example.moviesapp.data.network.responses.MovieRatingsResponse
import com.example.moviesapp.data.network.responses.MoviesResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("b/5f2c4877dddf413f95be718b")
    suspend fun getMoviesList(): Call<MoviesResponse>

    @GET("b/5f2c4951dddf413f95be721c")
    suspend fun getMoviesRatings(): Call<MovieRatingsResponse>

}