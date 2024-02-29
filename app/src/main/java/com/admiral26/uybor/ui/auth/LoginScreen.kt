package com.admiral26.uybor.ui.auth

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.uybor.R
import com.admiral26.uybor.databinding.ScreenLoginBinding
import com.admiral26.uybor.util.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

class LoginScreen :BaseFragment(R.layout.screen_login) {
    private val binding by viewBinding(ScreenLoginBinding::bind)
    override fun onCreated(view: View, savedInstanceState: Bundle?) {
binding.registerButton.setOnClickListener{
    findNavController().navigate(LoginScreenDirections.actionLoginScreenToCodeScreen())
}
    }
}