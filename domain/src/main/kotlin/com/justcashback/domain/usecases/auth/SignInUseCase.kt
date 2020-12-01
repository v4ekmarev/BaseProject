package com.justcashback.domain.usecases.auth

import com.justcashback.domain.usecases.base.FlowUseCase
import com.justcashback.domain.repository.AuthorizationRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SignInUseCase @Inject constructor(private val authorizationRepository: AuthorizationRepository) :
    FlowUseCase<SignInUseCase.SignInParam, String>() {

    override fun build(param: SignInParam): Flow<String> {
        return authorizationRepository.signIn(signInParam = param)
    }

    data class SignInParam(val email: String, val password: String)
}

