package com.justcashback.data.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import com.justcashback.data.persistence.dao.MerchantDao
import com.justcashback.data.persistence.entity.MerchantEntity

@Database(entities = [(MerchantEntity::class)], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun merchantDao(): MerchantDao

}
