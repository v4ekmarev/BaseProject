package com.justcashback.domain.function

import kotlinx.coroutines.flow.Flow


object StatementFlow {

    /**
     * Return an Flow that emits the emissions from one specified
     * Flow if a condition evaluates to true, or from another specified
     * Flow otherwise.
     *
     * @param <R> the result value type
     * @param condition the condition that decides which Observable to emit the emissions from
     * @param then the Flow sequence to emit to if `condition` is `true`
     * @param orElse the Flow sequence to emit to if `condition` is `false`
     * @return an Flow that mimics either the `then` or `orElse` Flow depending on a condition function
     */
    fun <R> ifThen(
        condition: Boolean,
        then: Flow<R>,
        orElse: Flow<R>
    ): Flow<R> =
        FlowIfThen(condition, then, orElse)

}
