package com.admiral26.uybor.ui.auth

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.uybor.R
import com.admiral26.uybor.databinding.ScreenCodeBinding
import com.admiral26.uybor.util.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

class CodeScreen:BaseFragment(R.layout.screen_code) {
    private val binding by viewBinding(ScreenCodeBinding::bind)
    override fun onCreated(view: View, savedInstanceState: Bundle?) {
binding.verificationButton.setOnClickListener{
    findNavController().navigate(CodeScreenDirections.actionCodeScreenToUserInformationScreen())
}
    }
}