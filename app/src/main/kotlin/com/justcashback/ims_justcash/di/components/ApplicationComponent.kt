package com.justcashback.ims_justcash.di.components

import android.app.Application
import com.justcashback.data.di.components.DataComponent
import com.justcashback.ims_justcash.JustCashBackApp
import com.justcashback.ims_justcash.di.modules.ApplicationModule
import com.justcashback.ims_justcash.di.modules.MainActivityModule
import com.justcashback.ims_justcash.di.modules.SignInActivityModule
import com.justcashback.ims_justcash.di.modules.ViewModelModule
import com.justcashback.ims_justcash.di.scopes.PerApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule


@PerApplication
@Component(
    dependencies = [(DataComponent::class)],
    modules = [
        ApplicationModule::class,
        ViewModelModule::class,
        AndroidInjectionModule::class,
        MainActivityModule::class,
        SignInActivityModule::class]
)
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun dataComponent(dataComponent: DataComponent): Builder

        fun build(): ApplicationComponent
    }

    fun inject(app: JustCashBackApp)

}
