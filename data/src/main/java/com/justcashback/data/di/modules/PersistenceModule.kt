package com.justcashback.data.di.modules

import android.content.Context
import com.justcashback.data.persistence.AppDatabase
import com.justcashback.data.persistence.DatabaseFactory
import com.justcashback.data.persistence.dao.MerchantDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class PersistenceModule {

    @Provides
    @Singleton
    internal fun provideAppDatabase(context: Context): AppDatabase =
        DatabaseFactory.getDatabase(context)

    @Provides
    @Singleton
    internal fun provideMerchantDao(appDatabase: AppDatabase): MerchantDao = appDatabase.merchantDao()

}
