package com.justcashback.ims_justcash.di.modules

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import com.vladlen.exmapleproject.di.PerActivity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule {

    @Provides
    @PerActivity
    internal fun provideActivity(activity: Activity) = activity as AppCompatActivity

}
