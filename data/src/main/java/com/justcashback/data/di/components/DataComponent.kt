package com.justcashback.data.di.components

import android.content.Context
import com.justcashback.data.di.modules.NetModule
import com.justcashback.data.di.modules.PersistenceModule
import com.justcashback.data.di.modules.RepositoryModule
import com.justcashback.data.net.api.MainApi
import com.justcashback.domain.repository.MerchantRepository
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [(NetModule::class), (PersistenceModule::class), (RepositoryModule::class)])
interface DataComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): DataComponent
    }

    fun provideMainApi(): MainApi
    fun provideMerchantRepository(): MerchantRepository
}