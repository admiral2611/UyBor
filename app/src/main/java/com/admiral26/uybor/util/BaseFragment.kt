package com.admiral26.uybor.util

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment


abstract class BaseFragment(@LayoutRes view: Int) : Fragment(view) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onCreated(view, savedInstanceState)
    }

    abstract fun onCreated(view: View, savedInstanceState: Bundle?)
}