package com.admiral26.uybor.ui.auth.codeVerification

import androidx.lifecycle.LiveData
import com.admiral26.uybor.core.model.code.CodeResponse
import com.admiral26.uybor.core.model.verification.VerificationRequest
import com.admiral26.uybor.core.model.verification.VerificationResponse

interface CodeViewModel {

    val getCodeLd: LiveData<CodeResponse?>
    val verificationNum: LiveData<VerificationResponse?>

    fun getCode()
    fun verificationNumb(code: VerificationRequest)
}