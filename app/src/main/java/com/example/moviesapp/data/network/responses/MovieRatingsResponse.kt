package com.example.moviesapp.data.network.responses

class MovieRatingsResponse : ArrayList<MovieRatingsResponse.MovieRatingsModelItem>(){
    data class MovieRatingsModelItem(
        val id: String,
        val ratings: List<Int>
    )
}