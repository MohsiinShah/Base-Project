package com.openweathermap.forecast.di.modules


import android.app.Application
import androidx.room.Room
import com.openweathermap.forecast.api.ApiService
import com.openweathermap.forecast.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module

class AppModule {

    @Provides
    @Singleton
    fun providesApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }
}