package com.brandon.movieinfoapp.presentation

import android.app.Application
import com.brandon.movieinfoapp.BuildConfig
import com.brandon.movieinfoapp.presentation.di.Injector
import com.brandon.movieinfoapp.presentation.di.core.*
import com.brandon.movieinfoapp.presentation.di.movie.MovieSubComponent



class App : Application(), Injector {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()
    }

    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }


}