package com.justcashback.ims_justcash.di.modules

import com.justcashback.ims_justcash.ui.authorization.signin.SignInFragment
import com.justcashback.ims_justcash.ui.dashboard.DashboardFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class MainFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeSignInFragment(): SignInFragment

    @ContributesAndroidInjector
    abstract fun contributeDashboardFragment(): DashboardFragment

}
