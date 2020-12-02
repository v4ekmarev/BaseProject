package com.justcashback.ims_justcash.di.components

import android.app.Activity
import com.justcashback.ims_justcash.di.modules.ViewModelModule
import com.justcashback.ims_justcash.ui.authorization.signin.SignInFragment
import com.vladlen.exmapleproject.di.PerActivity
import com.justcashback.ims_justcash.di.modules.ActivityModule
import dagger.BindsInstance
import dagger.Subcomponent

@PerActivity
@Subcomponent(modules = [(ActivityModule::class), (ViewModelModule::class)])
interface ActivityComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance activity: Activity): ActivityComponent
    }

    //region Inject
    fun inject(fragment: SignInFragment)

}
