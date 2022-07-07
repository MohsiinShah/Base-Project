package com.openweathermap.forecast.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u001cH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006!"}, d2 = {"Lcom/openweathermap/forecast/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/openweathermap/forecast/ui/MainAdapter;", "getAdapter", "()Lcom/openweathermap/forecast/ui/MainAdapter;", "setAdapter", "(Lcom/openweathermap/forecast/ui/MainAdapter;)V", "sharedPrefs", "Lcom/openweathermap/forecast/utils/MyAppPreferences;", "getSharedPrefs", "()Lcom/openweathermap/forecast/utils/MyAppPreferences;", "setSharedPrefs", "(Lcom/openweathermap/forecast/utils/MyAppPreferences;)V", "viewBinding", "Lcom/openweathermap/forecast/databinding/ActivityMainBinding;", "getViewBinding", "()Lcom/openweathermap/forecast/databinding/ActivityMainBinding;", "setViewBinding", "(Lcom/openweathermap/forecast/databinding/ActivityMainBinding;)V", "viewModel", "Lcom/openweathermap/forecast/ui/MainViewModel;", "getViewModel", "()Lcom/openweathermap/forecast/ui/MainViewModel;", "setViewModel", "(Lcom/openweathermap/forecast/ui/MainViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupObservers", "setupUI", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.openweathermap.forecast.ui.MainViewModel viewModel;
    @javax.inject.Inject()
    public com.openweathermap.forecast.utils.MyAppPreferences sharedPrefs;
    public com.openweathermap.forecast.databinding.ActivityMainBinding viewBinding;
    public com.openweathermap.forecast.ui.MainAdapter adapter;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.openweathermap.forecast.ui.MainViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.openweathermap.forecast.ui.MainViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.openweathermap.forecast.utils.MyAppPreferences getSharedPrefs() {
        return null;
    }
    
    public final void setSharedPrefs(@org.jetbrains.annotations.NotNull()
    com.openweathermap.forecast.utils.MyAppPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.openweathermap.forecast.databinding.ActivityMainBinding getViewBinding() {
        return null;
    }
    
    public final void setViewBinding(@org.jetbrains.annotations.NotNull()
    com.openweathermap.forecast.databinding.ActivityMainBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.openweathermap.forecast.ui.MainAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.openweathermap.forecast.ui.MainAdapter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupUI() {
    }
    
    private final void setupObservers() {
    }
}