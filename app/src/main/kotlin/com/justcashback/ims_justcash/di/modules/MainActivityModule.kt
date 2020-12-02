package com.justcashback.ims_justcash.di.modules

import com.justcashback.ims_justcash.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {

    @ContributesAndroidInjector(modules = [MainFragmentBuildersModule::class])
    abstract fun contributeMainActivity(): MainActivity

}