package com.example.moviesapp.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moviesapp.R
import com.example.moviesapp.data.models.MovieItemViewState
import com.example.moviesapp.databinding.MovieRowItemBinding

class FamousMovieAdapter(
    private val movieList: List<MovieItemViewState>
) : RecyclerView.Adapter<FamousMovieAdapter.ViewHolder>() {

    class ViewHolder(private val binding: MovieRowItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieItemViewState) {
            with(binding) {
                tvMovieGenres.text = movie.genres
                tvMovieRating.text = movie.averageRating
                tvMovieShort.text = movie.shortDescription
                tvMovieTitle.text = movie.title
                tvMovieReleaseDate.text = movie.releaseDate
                Glide.with(binding.root.context).load(movie.posterurl).into(ivMoviePosterImage)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = MovieRowItemBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = movieList[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }
}