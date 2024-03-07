package com.admiral26.uybor.ui.main_screen.home.detail

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.uybor.R
import com.admiral26.uybor.databinding.DetailHomeBinding
import com.admiral26.uybor.util.BaseFragment

class HomeDetail :BaseFragment(R.layout.detail_home) {
    private val binding by viewBinding(DetailHomeBinding::bind)
    override fun onCreated(view: View, savedInstanceState: Bundle?) {

    }
}