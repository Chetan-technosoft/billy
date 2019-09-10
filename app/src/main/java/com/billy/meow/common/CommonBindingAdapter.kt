package com.billy.meow.common

import android.widget.TextView
import androidx.databinding.BindingAdapter

/**
 * Created by Chetan on 10-09-2019.
 */
class CommonBindingAdapter {

    @BindingAdapter("android:text")
    fun setTextInInt(textView: TextView, value: Int) {
        if (textView.text != null && textView.text.toString().trim().isNotEmpty()) {

            if (textView.text.toString().trim().toInt() != value) {
                textView.text = value.toString()
            }
        } else {
            textView.text = value.toString()
        }
    }

    @BindingAdapter("android:text")
    fun setTextInDouble(textView: TextView, value: Double) {
        if (textView.text != null && textView.text.toString().trim().isNotEmpty()) {

            if (textView.text.toString().trim().toDouble() != value) {
                textView.text = value.toString()
            }
        } else {
            textView.text = value.toString()
        }
    }
}