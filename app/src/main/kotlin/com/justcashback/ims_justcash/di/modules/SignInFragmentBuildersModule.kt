package com.justcashback.ims_justcash.di.modules

import com.justcashback.ims_justcash.ui.authorization.signin.SignInFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class SignInFragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeSignInFragment(): SignInFragment

}
