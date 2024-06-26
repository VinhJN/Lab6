package com.vinhbqph33437.lab6.data

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface MovieService {
    @GET("movies")
    suspend fun getListFilms(): Response<List<MovieResponse>>
    @GET("film-detail.php")
    suspend fun getFilmDetail(@Query("id") id: String): Response<MovieResponse>

    @POST("add-film.php")
    suspend fun addFilm(@Body filmRequest: MovieRequest): Response<StatusResponse>

    @POST("update-film.php")
    suspend fun updateFilm(filmRequest1: String, @Body filmRequest: MovieRequest): Response<StatusResponse>

    @POST("delete-film.php")
    suspend fun deleteFilm(@Query("id") id: String): Response<StatusResponse>
}