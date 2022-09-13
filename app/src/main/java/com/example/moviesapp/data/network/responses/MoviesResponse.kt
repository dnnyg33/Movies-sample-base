package com.example.moviesapp.data.network.responses

class MoviesResponse : ArrayList<MoviesResponse.MoviesModelItem>(){
    data class MoviesModelItem(
        val actors: List<String>,
        val duration: String,
        val genres: List<String>,
        val id: String,
        val posterurl: String,
        val releaseDate: String,
        val storyline: String,
        val title: String,
        val year: String
    )
}