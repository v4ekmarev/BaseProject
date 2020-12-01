package com.justcashback.data.persistence.repository

import com.justcashback.data.di.providers.NetworkChecker
import com.justcashback.data.mapper.MerchantMapper
import com.justcashback.data.net.api.MainApi
import com.justcashback.data.persistence.dao.MerchantDao
import com.justcashback.domain.model.Merchant
import com.justcashback.domain.model.MerchantDetail
import com.justcashback.domain.repository.MerchantRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MerchantDataRepository @Inject constructor(
    private val mainApi: MainApi,
    private val merchantDao: MerchantDao,
    private val merchantMapper: MerchantMapper,
    private val networkChecker: NetworkChecker
) : MerchantRepository {

    override val isConnected: Boolean
        get() = networkChecker.isConnected

    //region LIST BOOK
    override fun getMerchants(): Flow<List<Merchant>> {
        TODO("Not yet implemented")
    }

    override fun getCacheMerchants(): Flow<List<Merchant>> {
        TODO("Not yet implemented")
    }

    //endregion

    //region BOOK
    override fun getMerchantDetail(id: String): Flow<MerchantDetail> {
        TODO("Not yet implemented")
    }
    //endregion
}
