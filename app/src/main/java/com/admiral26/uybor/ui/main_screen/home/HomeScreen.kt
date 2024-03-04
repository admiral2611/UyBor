package com.admiral26.uybor.ui.main_screen.home

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.uybor.R
import com.admiral26.uybor.databinding.ScreenHomeBinding
import com.admiral26.uybor.util.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeScreen : BaseFragment(R.layout.screen_home) {
    private val binding by viewBinding(ScreenHomeBinding::bind)
    override fun onCreated(view: View, savedInstanceState: Bundle?) {

    }
}