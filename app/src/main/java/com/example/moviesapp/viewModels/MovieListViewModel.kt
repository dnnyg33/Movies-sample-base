package com.example.moviesapp.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviesapp.data.models.MovieItemViewState
import com.example.moviesapp.data.network.responses.MoviesModelItem
import com.example.moviesapp.data.repositories.MovieRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieListViewModel
@Inject constructor(
    private val movieRepo: MovieRepository
) : ViewModel() {

    private val _movies = MutableStateFlow<List<MovieItemViewState>>(emptyList())
    val movies : StateFlow<List<MovieItemViewState>> = _movies


    init {
        viewModelScope.launch {
            val response = movieRepo.getMovies()
            if (response.isSuccessful) {
                _movies.value = response.body()?.run {
                    record.map {
                        it.toMovieItemViewState()
                    }
                } ?: emptyList()
            }
        }
    }

    private fun MoviesModelItem.toMovieItemViewState(): MovieItemViewState {
        return MovieItemViewState(
            title = title,
            posterurl = posterUrl,
            duration = duration,
            releaseDate = releaseDate,
            storyline = storyline,
            year = year,
            averageRating = "TODO",
            genres = "TODO",
            actors = "TODO",
            shortDescription = "TODO"
        )
    }
}