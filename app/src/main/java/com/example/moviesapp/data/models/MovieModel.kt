package com.example.moviesapp.data.models

import java.io.Serializable

data class MovieModel(
    val id: String,
    val title: String,
    val posterurl: String,
    val duration: String,
    val genres: List<String>,
    val actors: List<String>,
    val releaseDate: String,
    val storyline: String,
    val year: String,
    val ratings: List<Int>
): Serializable{
}









