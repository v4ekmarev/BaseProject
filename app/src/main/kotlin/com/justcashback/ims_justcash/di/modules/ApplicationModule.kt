package com.justcashback.ims_justcash.di.modules

import android.app.Application
import android.content.Context
import com.justcashback.ims_justcash.di.scopes.PerApplication
import dagger.Module
import dagger.Provides


@Module
class ApplicationModule {

    @Provides
    @PerApplication
    internal fun provideContext(application: Application): Context = application.baseContext

}
