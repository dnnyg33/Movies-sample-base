package com.example.moviesapp.data.network.responses

data class MoviesModelItem(
    val actors: List<String>,
    val duration: String,
    val genres: List<String>,
    val id: String,
    val posterUrl: String,
    val releaseDate: String,
    val storyline: String,
    val title: String,
    val year: String
)