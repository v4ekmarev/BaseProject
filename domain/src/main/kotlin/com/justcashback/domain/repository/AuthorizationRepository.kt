package com.justcashback.domain.repository

import com.justcashback.domain.usecases.auth.SignInUseCase
import kotlinx.coroutines.flow.Flow

interface AuthorizationRepository {

    //sign in
    fun signIn(signInParam: SignInUseCase.SignInParam): Flow<String>

    //sign up
}