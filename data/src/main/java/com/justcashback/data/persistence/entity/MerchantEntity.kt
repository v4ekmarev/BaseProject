package com.justcashback.data.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.justcashback.data.persistence.entity.MerchantEntity.Companion.MERCHANT_TABLE

@Entity(tableName = MERCHANT_TABLE)
class MerchantEntity(
    @PrimaryKey @ColumnInfo(name = MERCHANT_ID) val id: String
) {

    companion object {
        // TABLE
        const val MERCHANT_TABLE = "merchant_table"

        // COLUMN
        const val MERCHANT_ID = "id"
    }
}
