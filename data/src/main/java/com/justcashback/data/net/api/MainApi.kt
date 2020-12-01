package com.justcashback.data.net.api

import com.justcashback.data.net.dto.MerchantDTO
import com.justcashback.data.net.dto.MerchantDetailDTO
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MainApi {

    @GET("?maxResults=20")
    fun getListBooks(@Query("q") query: String): Flow<MerchantDTO>

    @GET("{id}")
    fun getBook(@Path("id") id: String): Flow<MerchantDetailDTO>

}
