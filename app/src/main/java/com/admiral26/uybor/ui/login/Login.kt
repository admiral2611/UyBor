package com.admiral26.uybor.ui.login

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.uybor.R
import com.admiral26.uybor.core.model.login.LoginRequest
import com.admiral26.uybor.databinding.LoginBinding
import com.admiral26.uybor.util.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Login : BaseFragment(R.layout.login) {
    private val binding by viewBinding(LoginBinding::bind)
    private val viewModel: LoginViewModel by viewModels<LoginViewModelImp>()
    override fun onCreated(view: View, savedInstanceState: Bundle?) {

        listenAction()
        observe()
    }

    private fun observe() {
        viewModel.loginLd.observe(viewLifecycleOwner) {
            it.let {
                if (it != null) {
                    viewModel.saveAccessToken(it.access)
                    findNavController().navigate(LoginDirections.actionLoginToMainScreen())
                }
            }
        }
    }

    private fun listenAction() {
        binding.loginButton.setOnClickListener {
            val userName = binding.userNameLogin.text?.trim().toString()
            val password = binding.userPassword.text?.trim().toString()
            if (userName.isBlank() || password.isBlank()) {
                return@setOnClickListener
            } else {
                val login = LoginRequest(userinput = userName, password = password)
                viewModel.login(login)
            }
        }
    }
}