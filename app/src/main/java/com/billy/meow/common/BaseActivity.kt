package com.billy.meow.common

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by Chetan on 10-09-2019.
 */
open class BaseActivity : AppCompatActivity() {

    //protected lateinit var component: CommonDataBindingComponent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //component = CommonDataBindingComponent()
    }


}