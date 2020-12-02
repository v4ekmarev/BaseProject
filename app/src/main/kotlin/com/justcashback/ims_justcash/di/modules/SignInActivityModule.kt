package com.justcashback.ims_justcash.di.modules

import com.justcashback.ims_justcash.ui.authorization.SignInActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class SignInActivityModule {

    @ContributesAndroidInjector(modules = [SignInFragmentBuildersModule::class])
    abstract fun contributeSignInActivity(): SignInActivity

}