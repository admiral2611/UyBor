package com.admiral26.uybor.ui.main_screen.home

import androidx.lifecycle.LiveData
import com.admiral26.uybor.core.model.home.HomeResponse

interface HomeViewModel {
    val getAllHomeLd:LiveData<HomeResponse?>

    fun getAllHome()
}