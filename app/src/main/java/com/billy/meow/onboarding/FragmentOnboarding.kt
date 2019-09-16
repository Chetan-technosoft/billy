package com.billy.meow.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.billy.meow.R
import com.billy.meow.common.CommonDataBindingComponent
import com.billy.meow.databinding.FragmentOnboardingBinding

/**
 * Created by Chetan on 2019-09-10.
 */
class FragmentOnboarding : Fragment() {

    lateinit var viewModel: OnboardingViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentOnboardingBinding =
            DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_onboarding,
                container,
                false,
                CommonDataBindingComponent
            )

        val application = requireNotNull(this.activity).application

        viewModel = ViewModelProvider(
            this,
            OnboardingVmFactory(application)
        ).get(OnboardingViewModel::class.java)

        binding.viewModel = viewModel

        binding.lifecycleOwner = this

        return binding.root
    }
}