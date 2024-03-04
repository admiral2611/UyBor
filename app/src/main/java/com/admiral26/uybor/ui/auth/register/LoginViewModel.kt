package com.admiral26.uybor.ui.auth.register

import androidx.lifecycle.LiveData
import com.admiral26.uybor.core.model.auth.signUp.NumberRequest
import com.admiral26.uybor.core.model.auth.signUp.NumberResponse

interface LoginViewModel {

val numberLd:LiveData<NumberResponse?>
fun number(number: NumberRequest)

fun saveAccess(access:String)
}