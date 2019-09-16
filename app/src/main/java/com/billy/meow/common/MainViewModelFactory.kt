package com.billy.meow.common

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.billy.meow.viewmodel.MainViewModel

/**
 * Created by Chetan on 2019-09-16.
 */
class MainViewModelFactory(private val application: Application) : ViewModelProvider.Factory {


    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {

            @Suppress("UNCHECKED_CAST")
            return MainViewModel(application = application) as T
        }
        throw IllegalArgumentException("Unknown ViewMOdel class")
    }
}