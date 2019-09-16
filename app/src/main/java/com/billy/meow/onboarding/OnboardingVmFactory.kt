package com.billy.meow.onboarding

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * Created by Chetan on 2019-09-17.
 */
class OnboardingVmFactory(private val application: Application) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(OnboardingViewModel::class.java)) {

            @Suppress("UNCHECKED_CAST")
            return OnboardingViewModel(application = application) as T
        }
        throw IllegalArgumentException("Unknown ViewMOdel class")
    }
}