package com.justcashback.domain.function

import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/**
 * Copyright (C) 2020 Mikhael LOPEZ
 * Licensed under the Apache License Version 2.0
 * When an [Single] subscribes, the condition is evaluated
 * and the appropriate [SingleSource] is subscribed to.
 * @param <T> the common value type of the Single
 */
class FlowIfThen<T>(
    private val condition: Boolean,
    private val then: Flow<T>,
    private val orElse: Flow<T>
) : Flow<T> {

    @InternalCoroutinesApi
    override suspend fun collect(collector: FlowCollector<T>) {

        if (condition) {
            then.collect(collector)
        } else {
            orElse.collect(collector)
        }
    }
}

