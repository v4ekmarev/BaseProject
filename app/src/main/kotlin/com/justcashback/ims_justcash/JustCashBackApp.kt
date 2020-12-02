package com.justcashback.ims_justcash

import android.app.Application
import com.justcashback.data.di.components.DaggerDataComponent
import com.justcashback.data.di.components.DataComponent
import com.justcashback.ims_justcash.di.AppInjector
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class JustCashBackApp : Application(), HasAndroidInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    private val dataComponent: DataComponent by lazy {
        DaggerDataComponent.factory().create(baseContext)
    }

    override fun onCreate() {
        super.onCreate()
        AppInjector.init(this, dataComponent)
    }

    override fun androidInjector(): AndroidInjector<Any> = dispatchingAndroidInjector

}