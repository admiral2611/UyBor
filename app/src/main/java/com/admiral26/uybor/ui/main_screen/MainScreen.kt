package com.admiral26.uybor.ui.main_screen

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.uybor.R
import com.admiral26.uybor.core.adapter.MainAdapter
import com.admiral26.uybor.databinding.ScreenMainBinding
import com.admiral26.uybor.util.BaseFragment

class MainScreen : BaseFragment(R.layout.screen_main) {
    private val binding by viewBinding(ScreenMainBinding::bind)
    override fun onCreated(view: View, savedInstanceState: Bundle?) {
        val adapter = MainAdapter(childFragmentManager, lifecycle)
        binding.viewpager.adapter = adapter
        binding.viewpager.isUserInputEnabled = false
        binding.bottomnavigationview.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.homeMenu -> binding.viewpager.setCurrentItem(0, false)
                R.id.addNewHomMenu -> binding.viewpager.setCurrentItem(1, false)
                R.id.profileMenu -> binding.viewpager.setCurrentItem(2, false)
            }
            true
        }
    }
}