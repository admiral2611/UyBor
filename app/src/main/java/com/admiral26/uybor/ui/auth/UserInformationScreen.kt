package com.admiral26.uybor.ui.auth

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.uybor.R
import com.admiral26.uybor.databinding.ScreenUserInformationBinding
import com.admiral26.uybor.util.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

class UserInformationScreen :BaseFragment(R.layout.screen_user_information) {
    private val binding by viewBinding(ScreenUserInformationBinding::bind)
    override fun onCreated(view: View, savedInstanceState: Bundle?) {

    }
}