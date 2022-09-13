package com.example.moviesapp.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesapp.R
import com.example.moviesapp.viewModels.MovieListViewModel
import com.example.moviesapp.views.adapters.FamousMovieAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FamousMoviesActivity : AppCompatActivity() {
    private val viewModel: MovieListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


}