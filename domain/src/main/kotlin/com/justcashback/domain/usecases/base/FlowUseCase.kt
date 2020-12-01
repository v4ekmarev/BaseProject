package com.justcashback.domain.usecases.base

import kotlinx.coroutines.flow.Flow

abstract class FlowUseCase<P, R> : UseCase<P, Flow<R>>() {

    override fun execute(param: P): Flow<R> {
        return super.execute(param)
    }
}
