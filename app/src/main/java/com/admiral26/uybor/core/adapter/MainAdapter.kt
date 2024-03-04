package com.admiral26.uybor.core.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.admiral26.uybor.ui.main_screen.add_new.AddNewHomeScreen
import com.admiral26.uybor.ui.main_screen.home.HomeScreen
import com.admiral26.uybor.ui.main_screen.profile.ProfileScreen

class MainAdapter(fm: FragmentManager, lc: Lifecycle) : FragmentStateAdapter(fm, lc) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeScreen()
            1 -> AddNewHomeScreen()
            else -> ProfileScreen()
        }
    }
}