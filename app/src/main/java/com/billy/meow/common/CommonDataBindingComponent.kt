package com.billy.meow.common

import androidx.databinding.DataBindingComponent

/**
 * Created by Chetan on 10-09-2019.
 */
class CommonDataBindingComponent : DataBindingComponent {
    private val bindingAdapter = CommonBindingAdapter()

    fun getCommonBindingAdapter(): CommonBindingAdapter {
        return bindingAdapter
    }
}