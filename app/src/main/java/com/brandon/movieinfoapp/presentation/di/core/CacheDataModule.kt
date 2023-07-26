package com.brandon.movieinfoapp.presentation.di.core

import com.brandon.movieinfoapp.data.repository.datasource.MovieCacheDataSource
import com.brandon.movieinfoapp.data.repository.datasourceImpl.MovieCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

}