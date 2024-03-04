package com.admiral26.uybor.ui.auth.codeVerification

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.uybor.R
import com.admiral26.uybor.core.model.auth.verification.VerificationRequest
import com.admiral26.uybor.databinding.ScreenCodeBinding
import com.admiral26.uybor.util.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CodeScreen : BaseFragment(R.layout.screen_code) {
    private val binding by viewBinding(ScreenCodeBinding::bind)
    private val viewModel:CodeViewModel by viewModels<CodeViewModelImp>()

    override fun onCreated(view: View, savedInstanceState: Bundle?) {
        actionView()
        observe()
    }

    private fun actionView() {
        binding.verificationButton.setOnClickListener{
            val toString = binding.code.text?.trim().toString()
            if (toString.isBlank()){
                return@setOnClickListener
            }
            val code= VerificationRequest(code = toString)
            viewModel.verificationNumb(code)
        }
    }

    private fun observe() {
        viewModel.getCode()
        viewModel.getCodeLd.observe(viewLifecycleOwner){
            Log.d("TAGcode", "observe:")
            it?.let {
                Toast.makeText(requireContext(), it.code, Toast.LENGTH_SHORT).show()
                binding.code.setText(it.code.toString())
            }
        }

        viewModel.verificationNum.observe(viewLifecycleOwner){
            it?.let {
                if (it.success){
                    findNavController().navigate(CodeScreenDirections.actionCodeScreenToUserInformationScreen())
                }
            }
        }
    }


}