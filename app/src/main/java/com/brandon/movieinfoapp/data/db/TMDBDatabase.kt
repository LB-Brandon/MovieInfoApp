package com.brandon.movieinfoapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.brandon.movieinfoapp.data.model.movie.Movie


@Database(entities = [Movie::class], version = 1, exportSchema = false)
abstract class TMDBDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao
}