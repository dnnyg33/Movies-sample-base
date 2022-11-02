package com.example.moviesapp.data.models

import java.io.Serializable

data class MovieItemViewState(
    val title: String,
    val posterurl: String,
    val duration: String,
    val genres: String,
    val actors: String,
    val releaseDate: String,
    val storyline: String,
    val year: String,
    val averageRating: String,
    val shortDescription: String
): Serializable{
}









