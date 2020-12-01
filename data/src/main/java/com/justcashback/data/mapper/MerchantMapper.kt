package com.justcashback.data.mapper

import com.justcashback.data.net.dto.MerchantDTO
import com.justcashback.data.persistence.entity.MerchantEntity
import com.justcashback.domain.model.Merchant
import javax.inject.Inject

class MerchantMapper @Inject constructor() {

    //region DTO to MODEL

    fun transformFromDtoToModel(dto: MerchantDTO): Merchant =
        Merchant(dto.id)


    fun transformFromDtoToModel(dtoCollection: Collection<MerchantDTO>): List<Merchant> =
        dtoCollection.map { transformFromDtoToModel(it) }
    //endregion


    //region ENTITY to MODEL

    fun transformFromEntityToModel(entity: MerchantEntity): Merchant =
        Merchant(
            entity.id
        )

    fun transformFromEntityToModel(entityCollection: Collection<MerchantEntity>): List<Merchant> =
        entityCollection.map { transformFromEntityToModel(it) }
    //endregion

    //region MODEL to ENTITY

    fun transformFromModelToEntity(model: Merchant): MerchantEntity =
        MerchantEntity(
            model.id
        )

    fun transformFromModelToEntity(modelCollection: Collection<Merchant>): List<MerchantEntity> =
        modelCollection.map { transformFromModelToEntity(it) }
    //endregion

}