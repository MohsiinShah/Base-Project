package com.openweathermap.forecast.ui;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\'\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/openweathermap/forecast/ui/MainActivityModule;", "", "()V", "Companion", "app_debug"})
@dagger.Module()
public abstract class MainActivityModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.openweathermap.forecast.ui.MainActivityModule.Companion Companion = null;
    
    public MainActivityModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public static final com.openweathermap.forecast.ui.MainViewModel provideMainViewModel() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/openweathermap/forecast/ui/MainActivityModule$Companion;", "", "()V", "provideMainViewModel", "Lcom/openweathermap/forecast/ui/MainViewModel;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        public final com.openweathermap.forecast.ui.MainViewModel provideMainViewModel() {
            return null;
        }
    }
}