package com.example.moviesapp.viewModels

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.moviesapp.data.models.MovieModel
import com.example.moviesapp.data.repositories.MovieRepository
import com.google.common.truth.Truth.assertThat
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@ExperimentalCoroutinesApi
@RunWith(JUnit4::class)
class MovieListViewModelTest{
    private var fakeMovieRepo: MovieRepository = mockk()
    private var testDispatcher = TestCoroutineDispatcher()
    private lateinit var movieListViewModel: MovieListViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setUp(){
        coEvery { fakeMovieRepo.getMovieList() } returns arrayListOf<MovieModel>(
            MovieModel(
                "1",
                "test1",
                "test",
                "180M",
                listOf("test","test","test"),
                listOf("test","test","test"),
                "1999-01-22",
                "test",
                "1999",
                listOf(10,10,10,10,10)
            ),
            MovieModel(
                "2",
                "test1",
                "test",
                "90M",
                listOf("test","test","test"),
                listOf("test","test","test"),
                "1992-01-22",
                "test",
                "1992",
                listOf(2,2,2,2,2)
            ),
            MovieModel(
                "3",
                "test1",
                "test",
                "120M",
                listOf("test","test","test"),
                listOf("test","test","test"),
                "1975-01-22",
                "test",
                "1975",
                listOf(4,4,4,4,4)
            ),            MovieModel(
                "4",
                "test1",
                "test",
                "75M",
                listOf("test","test","test"),
                listOf("test","test","test"),
                "2005-01-22",
                "test",
                "2005",
                listOf(7,7,7,7,7)
            )
        )
        movieListViewModel = MovieListViewModel(fakeMovieRepo, testDispatcher)
    }


    @Test
    fun `movies are properly sorted by rating, movies before minimum year are removed`(){
        assertThat(movieListViewModel.moviesList.value).isEqualTo(
            arrayListOf<MovieModel>(
                MovieModel(
                    "1",
                    "test1",
                    "test",
                    "180M",
                    listOf("test","test","test"),
                    listOf("test","test","test"),
                    "1999-01-22",
                    "test",
                    "1999",
                    listOf(10,10,10,10,10)
                ),
                MovieModel(
                    "4",
                    "test1",
                    "test",
                    "75M",
                    listOf("test","test","test"),
                    listOf("test","test","test"),
                    "2005-01-22",
                    "test",
                    "2005",
                    listOf(7,7,7,7,7)
                ),
                MovieModel(
                    "2",
                    "test1",
                    "test",
                    "90M",
                    listOf("test","test","test"),
                    listOf("test","test","test"),
                    "1992-01-22",
                    "test",
                    "1992",
                    listOf(2,2,2,2,2)
                )
            )
        )
    }
}