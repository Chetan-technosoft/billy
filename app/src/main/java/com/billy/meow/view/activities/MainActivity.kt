package com.billy.meow.view.activities

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.billy.meow.R
import com.billy.meow.common.BaseActivity
import com.billy.meow.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main, component)
    }
}
