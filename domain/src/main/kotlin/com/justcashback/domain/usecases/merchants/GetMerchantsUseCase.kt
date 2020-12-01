package com.justcashback.domain.usecases.merchants

import com.justcashback.domain.function.StatementFlow
import com.justcashback.domain.model.Merchant
import com.justcashback.domain.repository.MerchantRepository
import com.justcashback.domain.usecases.base.FlowUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMerchantsUseCase @Inject constructor(private val merchantRepository: MerchantRepository) :
    FlowUseCase<String, List<Merchant>>() {

    override fun build(param: String): Flow<List<Merchant>> {

        val getCacheMerchants = merchantRepository.getCacheMerchants()

        val networkMerchants = merchantRepository.getMerchants()

        return StatementFlow.ifThen(
            merchantRepository.isConnected,
            networkMerchants,
            getCacheMerchants
        )
    }
}
