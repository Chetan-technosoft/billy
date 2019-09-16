package com.billy.meow.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.billy.meow.R
import com.billy.meow.common.CommonDataBindingComponent
import com.billy.meow.databinding.FragmentTablesBinding

/**
 * Created by Chetan on 2019-09-16.
 */
class FragmentTables : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentTablesBinding =
            DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_tables,
                container,
                false,
                CommonDataBindingComponent
            )

        return binding.root
    }
}