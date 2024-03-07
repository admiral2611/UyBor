package com.admiral26.uybor.ui.main_screen.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.uybor.R
import com.admiral26.uybor.core.adapter.HomeAdapter
import com.admiral26.uybor.databinding.ScreenHomeBinding
import com.admiral26.uybor.util.BaseFragment
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeScreen : BaseFragment(R.layout.screen_home) {
    private val binding by viewBinding(ScreenHomeBinding::bind)
    private val viewModel: HomeViewModel by viewModels<HomeViewModelImp>()
    private val adaptor by lazy { HomeAdapter() }
    override fun onCreated(view: View, savedInstanceState: Bundle?) {
        viewModel.getAllHome()
        observe()
        setAdapter()
    }

    private fun setAdapter() {
        binding.rvList.adapter = adaptor
        binding.rvList.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding.rvList.setHasFixedSize(true)
    }

    private fun observe() {
        viewModel.getAllHomeLd.observe(viewLifecycleOwner) {
            it?.let {
                val results = it.results
                adaptor.setData(it.results)

            }
        }
    }
}