package com.admiral26.uybor.ui.auth.codeVerification

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.uybor.R
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

    }

    private fun observe() {
        viewModel.getCodeLd.observe(this){
            it?.let {
                Toast.makeText(requireContext(), "${it.code}", Toast.LENGTH_SHORT).show()
            }
        }

        viewModel.verificationNum.observe(this){
            it?.let {

            }
        }
    }


}