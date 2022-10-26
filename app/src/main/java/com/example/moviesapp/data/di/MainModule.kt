package com.example.moviesapp.data.di

import com.example.moviesapp.data.network.MovieApiInterface
import com.example.moviesapp.data.network.ServiceBuilder
import com.example.moviesapp.data.repositories.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MainModule {
    @Provides
    @Singleton
    fun provideMovieRepository(): MovieRepository{
        return MovieRepository(provideMovieApiInterface())
    }

    @Provides
    @Singleton
    fun provideMovieApiInterface(): MovieApiInterface{
        return ServiceBuilder.buildService(MovieApiInterface::class.java)
    }

}