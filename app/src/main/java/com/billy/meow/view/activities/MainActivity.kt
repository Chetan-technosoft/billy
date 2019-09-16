package com.billy.meow.view.activities

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProvider
import com.billy.meow.R
import com.billy.meow.common.CommonDataBindingComponent
import com.billy.meow.common.MainViewModelFactory
import com.billy.meow.databinding.ActivityMainBinding
import com.billy.meow.viewmodel.MainViewModel

class MainActivity : FragmentActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main, CommonDataBindingComponent)

        viewModel = ViewModelProvider(
            this,
            MainViewModelFactory(application)
        ).get(MainViewModel::class.java)

        binding.viewModel = viewModel

        binding.lifecycleOwner = this
    }
}
