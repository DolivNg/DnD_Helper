package com.dolivdev.helperdnd.domain.entity.equipnet

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.dolivdev.helperdnd.domain.entity.equipnet.conrtact.EquipmentContract

@Entity
data class EquipmentEntity(
    @PrimaryKey val _id: Int,
    @ColumnInfo(name = EquipmentContract.EquipmentEntry.COLUMN_TOOLE_NANE) val nameToole : String = "",
    @ColumnInfo(name = EquipmentContract.EquipmentEntry.COLUMN_TOOLE_PRICE) val priceToole : String = "",
    @ColumnInfo(name = EquipmentContract.EquipmentEntry.COLUMN_TOOLE_WIGHT) val weightToole : String = "",
    @ColumnInfo(name = EquipmentContract.EquipmentEntry.COLUMN_TOOLE_DESCRIPTION) val descriptionToole : String = "",
    @ColumnInfo(name = EquipmentContract.EquipmentEntry.COLUMN_CATEGORY_ID) val categoryToole : String = "",
    @ColumnInfo(name = EquipmentContract.EquipmentEntry.COLUMN_COIN_ID) val coinType: String = "",
    @ColumnInfo(name = EquipmentContract.EquipmentEntry.COLUMN_COIN_ID) val sourceToole: String = "",
    var VisibleToole : Boolean = false,
    var HomeBrew : Boolean = false
)
