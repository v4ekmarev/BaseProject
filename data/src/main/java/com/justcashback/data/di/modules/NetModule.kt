package com.justcashback.data.di.modules

import android.content.Context
import com.google.gson.Gson
import com.justcashback.data.di.providers.NetworkChecker
import com.justcashback.data.net.OkHttpClientFactory
import com.justcashback.data.net.RetrofitFactory
import com.justcashback.data.net.api.MainApi
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class NetModule {

    @Provides
    @Singleton
    internal fun provideMoshi(): Moshi = Moshi.Builder()
        .build()

    @Provides
    @Singleton
    internal fun provideNetworkChecker(context: Context): NetworkChecker = NetworkChecker(context)

    @Provides
    @Singleton
    internal fun provideOkHttpClientFactory(): OkHttpClientFactory = OkHttpClientFactory()

    @Provides
    @Singleton
    internal fun provideRetrofit(
        context: Context,
        moshi: Moshi,
        okHttpClientFactory: OkHttpClientFactory
    ): Retrofit =
        RetrofitFactory.getRetrofit(context, moshi, okHttpClientFactory)

    @Singleton
    @Provides
    internal fun provideApiClient(retrofit: Retrofit): MainApi =
        retrofit.create(MainApi::class.java)
}