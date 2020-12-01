package com.justcashback.domain.exception

sealed class AppException(message: String) : RuntimeException(message)

/**
 * Exception used when it is impossible to get data due to a lack of connection
 */
object NoConnectedException : AppException("No connection")
