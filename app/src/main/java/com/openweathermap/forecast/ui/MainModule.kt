package com.openweathermap.forecast.ui

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
abstract class MainActivityModule {

    companion object{

        @Provides
        @JvmStatic
        fun provideMainViewModel(): MainViewModel{
            return MainViewModel()
        }
    }
}