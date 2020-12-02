package com.justcashback.ims_justcash.ui.authorization.signin

import androidx.lifecycle.ViewModel
import com.justcashback.domain.usecases.auth.SignInUseCase
import javax.inject.Inject

class SignInViewModel @Inject constructor(private val signInUseCase: SignInUseCase) : ViewModel() {

}