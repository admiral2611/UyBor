package com.admiral26.uybor.ui.main_screen.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.admiral26.uybor.core.model.home.HomeResponse
import com.admiral26.uybor.core.repo.HomeRepository
import com.admiral26.uybor.util.ResultWrapper
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModelImp @Inject constructor(
    private val repository: HomeRepository
) : HomeViewModel, ViewModel() {

    private val _getAllHomeLd = MutableLiveData<HomeResponse?>()
    override val getAllHomeLd: LiveData<HomeResponse?> = _getAllHomeLd

    override fun getAllHome() {

        viewModelScope.launch(Dispatchers.IO) {
            when (val result = repository.getAllHome()) {
                is ResultWrapper.ErrorResponse -> {

                }

                is ResultWrapper.NetworkError -> {


                }

                is ResultWrapper.Success -> {
                    Log.d("result1", "getAllHome: ${result.response?.results}")
                    _getAllHomeLd.postValue(result.response)
                }
            }
        }

    }
}