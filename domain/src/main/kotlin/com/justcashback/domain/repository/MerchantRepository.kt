package com.justcashback.domain.repository

import com.justcashback.domain.model.Merchant
import com.justcashback.domain.model.MerchantDetail
import kotlinx.coroutines.flow.Flow

interface MerchantRepository {

    val isConnected: Boolean

    //list
    fun getMerchants(): Flow<List<Merchant>>

    fun getCacheMerchants(): Flow<List<Merchant>>


    //single

    fun getMerchantDetail(id: String): Flow<MerchantDetail>
}