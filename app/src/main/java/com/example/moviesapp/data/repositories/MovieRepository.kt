package com.example.moviesapp.data.repositories

import com.example.moviesapp.data.network.MovieApiInterface
import com.example.moviesapp.data.network.responses.MoviesModelItem
import com.example.moviesapp.data.network.responses.MoviesResponse
import retrofit2.Call
import retrofit2.Response
import javax.inject.Inject

class MovieRepository
@Inject constructor(private val apiInterface: MovieApiInterface) {
    suspend fun getMovies(): Response<MoviesResponse> {
        return apiInterface.getMoviesList()
    }
}