package com.example.moviesapp.viewModels

import androidx.lifecycle.ViewModel
import com.example.moviesapp.data.repositories.MovieRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

@HiltViewModel
class MovieListViewModel
@Inject constructor(
    private val movieRepo: MovieRepository,
    private val dispatcher: CoroutineDispatcher
): ViewModel(){
}