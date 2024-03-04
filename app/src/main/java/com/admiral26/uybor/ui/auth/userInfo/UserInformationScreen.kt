package com.admiral26.uybor.ui.auth.userInfo

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.uybor.R
import com.admiral26.uybor.core.model.auth.userInfo.UserInfoRequest
import com.admiral26.uybor.databinding.ScreenUserInformationBinding
import com.admiral26.uybor.util.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserInformationScreen : BaseFragment(R.layout.screen_user_information) {
    private val binding by viewBinding(ScreenUserInformationBinding::bind)
    private val viewModel: UserInfoViewModel by viewModels<UserInfoViewModelImp>()

    override fun onCreated(view: View, savedInstanceState: Bundle?) {
        listenAction()
        observe()
    }

    private fun listenAction() {
        binding.signUpButton.setOnClickListener {
            val firsName = binding.firstName.text?.trim().toString()
            val lastName = binding.lastName.text?.trim().toString()
            val userName = binding.userName.text?.trim().toString()
            val password1 = binding.firstPassword.text?.trim().toString()
            val password2 = binding.secondPassword.text?.trim().toString()

            if (firsName.isBlank() || lastName.isBlank() || userName.isBlank() || password1.isBlank() || password2.isBlank()) {
                return@setOnClickListener
            }
            if (password1 != password2) {
                Toast.makeText(requireContext(), "Password Wrong", Toast.LENGTH_SHORT).show()
            }
            val data = UserInfoRequest(
                firstName = firsName,
                lastName = lastName,
                username = userName,
                confirmPassword = password1,
                password = password2
            )
            data?.let {
                viewModel.userInfo(it)
            }

        }
    }

    private fun observe() {
        viewModel.userInfo.observe(this) {

            it?.let {
                if (it.success) {
                    Toast.makeText(requireContext(), "Muvofaqiyatli otdingiz", Toast.LENGTH_SHORT)
                        .show()
                    findNavController().navigate(UserInformationScreenDirections.actionUserInformationScreenToMainScreen())
                }
            }
        }
    }
}