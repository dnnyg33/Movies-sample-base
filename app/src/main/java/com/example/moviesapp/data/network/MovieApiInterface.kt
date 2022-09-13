package com.example.moviesapp.data.network

import com.example.moviesapp.data.network.responses.MovieRatingsResponse
import com.example.moviesapp.data.network.responses.MoviesResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/v3/b/630ce21d5c146d63ca84a405")
    suspend fun getMoviesList(): Call<MoviesResponse>

    @GET("/v3/b/630ce2395c146d63ca84a426")
    suspend fun getMoviesRatings(): Call<MovieRatingsResponse>

}