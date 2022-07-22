package com.dolivdev.helperdnd.domain.entity.equipnet

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.dolivdev.helperdnd.domain.entity.equipnet.conrtact.EquipmentContract

class EquipDataEntity {
    @Entity(tableName = "equipment")
    data class EquipmentEntity(
        @PrimaryKey @ColumnInfo(name = "_id")  val _id: Int,
        @ColumnInfo(name = "toole_name") val nameTool : String = "",
        @ColumnInfo(name = "toole_price") val priceTool : Int = 0,
        @ColumnInfo(name = "toole_wight") val weightTool : String = "",
        @ColumnInfo(name = "toole_description") val descriptionTool : String = "",

        @ColumnInfo(name = "category_id") val category_id : Int = 0,
        @ColumnInfo(name = "coin_id") val coin_id: Int = 0,
        @ColumnInfo(name = "toole_source") val source_id: Int = 0,
        @ColumnInfo(name = "type_id") val type_id: Int = 0,
    )



    @Entity
    data class ToolTypeEntity(
        @PrimaryKey @ColumnInfo(name = "_id")  val _id: Int,
        @ColumnInfo(name = "sbt_name") val sbt_name : String = "",
        @ColumnInfo(name = "category_id") val category_id : Int = 0,
        @ColumnInfo(name = "chance") val chance : Int = 0
    )

    @Entity
    data class CoinEntity(
        @PrimaryKey
        @ColumnInfo(name = "_id") val _id: Int,
        @ColumnInfo(name = "type_coin") val type_coin : String = "",
    )

    @Entity
    data class CategoryEntity(
        @PrimaryKey @ColumnInfo(name = "_id")  val _id: Int,
        @ColumnInfo(name = "ct_name") val ct_name : String = "",
    )

    @Entity
    data class MarketEntity(
        @PrimaryKey @ColumnInfo(name = "_id")  val _id: Int,
        @ColumnInfo(name = "name") val name : String = "",
        @ColumnInfo(name = "city") val city : String = "",
    )

    @Entity
    data class MarketTableEntity(
        @PrimaryKey @ColumnInfo(name = "_id")  val _id: Int,
        @ColumnInfo(name = "market_id") val market_id : String = "",
        @ColumnInfo(name = "equipment_id") val equipment_id : String = "",
        @ColumnInfo(name = "value") val value : String = ""
    )

}