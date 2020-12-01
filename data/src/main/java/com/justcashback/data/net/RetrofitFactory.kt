package com.justcashback.data.net

import android.Manifest
import android.content.Context
import androidx.annotation.RequiresPermission
import com.squareup.moshi.Moshi

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitFactory {

    // Base URL: always ends with /
    private const val URL_MAIN_WEBSERVICE = ""

    /**
     * Get [Retrofit] instance.
     * @return instances of [Retrofit]
     */
    @RequiresPermission(value = Manifest.permission.INTERNET)
    fun getRetrofit(
        context: Context,
        moshi: Moshi,
        okHttpClientFactory: OkHttpClientFactory
    ): Retrofit =
        Retrofit.Builder()
            .baseUrl(URL_MAIN_WEBSERVICE)
            .client(okHttpClientFactory.createOkHttpClient(context))
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()

}
