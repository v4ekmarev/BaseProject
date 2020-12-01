package com.justcashback.data.di.modules

import com.justcashback.data.di.providers.NetworkChecker
import com.justcashback.data.mapper.MerchantMapper
import com.justcashback.data.net.api.MainApi
import com.justcashback.data.persistence.dao.MerchantDao
import com.justcashback.data.persistence.repository.MerchantDataRepository
import com.justcashback.domain.repository.MerchantRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class RepositoryModule {

    @Provides
    @Singleton
    internal fun provideMerchantDataRepository(
        mainApi: MainApi,
        merchantMapper: MerchantMapper,
        merchantDao: MerchantDao,
        networkChecker: NetworkChecker
    ): MerchantRepository =
        MerchantDataRepository(mainApi, merchantDao, merchantMapper, networkChecker)

}
