package com.example.samplestructureapp.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.samplestructureapp.repository.AppRepository
import com.example.samplestructureapp.ui.main.viewmodel.MainViewModel

class ViewModelProviderFactory(
    private val app: Application,
    private val appRepository: AppRepository,
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(app, appRepository) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}