package com.example.andrioddemo

class MoviesRepository (
    private val api : MoviesApi
) : SafeApiRequest() {

     suspend fun getMovies() = apiRequest { api.getMovies() }
}