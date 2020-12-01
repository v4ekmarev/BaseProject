package com.justcashback.data.persistence.dao

import androidx.room.*
import com.justcashback.data.persistence.dao.base.BaseDao
import com.justcashback.data.persistence.entity.MerchantEntity

@Dao
abstract class MerchantDao : BaseDao<MerchantEntity> {

}
