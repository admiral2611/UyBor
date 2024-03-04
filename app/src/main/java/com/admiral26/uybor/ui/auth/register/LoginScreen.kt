package com.admiral26.uybor.ui.auth.register

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.uybor.R
import com.admiral26.uybor.core.model.auth.signUp.NumberRequest
import com.admiral26.uybor.databinding.ScreenLoginBinding
import com.admiral26.uybor.util.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginScreen : BaseFragment(R.layout.screen_login) {
    private val binding by viewBinding(ScreenLoginBinding::bind)
    private val viewModel: LoginViewModel by viewModels<LoginViewModelImp>()
    override fun onCreated(view: View, savedInstanceState: Bundle?) {
        observe()
        listenAction()
    }

    private fun listenAction() {
        binding.registerButton.setOnClickListener {
            val phoneNum = binding.phoneNum.text?.trim().toString()
            if (phoneNum.isBlank()) {
                return@setOnClickListener
            } else {
                val num = NumberRequest(emailPhoneNumber = phoneNum)
                viewModel.number(num)
            }
        }
    }

    private fun observe() {
        viewModel.numberLd.observe(this) {
            it?.let { token ->
                Log.d("TAGtoken", "observe: ${token.access}")
                viewModel.saveAccess(token.access)
                findNavController().navigate(LoginScreenDirections.actionLoginScreenToCodeScreen())
            }
        }
    }
}