package com.justcashback.domain.usecases.base

abstract class UseCase<P, R> {

    protected abstract fun build(param: P): R

    open fun execute(param: P): R {
        return build(param)
    }

}