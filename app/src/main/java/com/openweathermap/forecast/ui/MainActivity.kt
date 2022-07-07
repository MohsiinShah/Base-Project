package com.openweathermap.forecast.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.openweathermap.forecast.R
import com.openweathermap.forecast.databinding.ActivityMainBinding
import com.openweathermap.forecast.utils.*
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: MainViewModel

    @Inject
    lateinit var sharedPrefs: MyAppPreferences

    lateinit var viewBinding: ActivityMainBinding

    lateinit var adapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setupUI()
        setupObservers()
    }

    private fun setupUI() {

    }

    private fun setupObservers() {

    }

}