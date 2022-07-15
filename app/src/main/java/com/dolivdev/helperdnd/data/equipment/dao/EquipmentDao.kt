package com.dolivdev.helperdnd.data.equipment.dao

import androidx.room.*
import com.dolivdev.helperdnd.data.equipment.contact.EquipmentContract
import com.dolivdev.helperdnd.domain.entity.equipnet.TooleEntity

@Dao
interface EquipmentDao {

    @Query(
        ("SELECT eq."
                + EquipmentContract.EquipmentEntry._ID) +
                ", cat."
                + EquipmentContract.CategoryEntry.COLUMN_NAME +
                ", typ."
                + EquipmentContract.TypeEntry.COLUMN_NAME +
                ", eq."
                + EquipmentContract.EquipmentEntry.COLUMN_TOOLE_NANE +
                ", eq."
                + EquipmentContract.EquipmentEntry.COLUMN_TOOLE_PRICE +
                ", con."
                + EquipmentContract.CoinEntry.COLUMN_TYPE_PRICE +
                ", eq."
                + EquipmentContract.EquipmentEntry.COLUMN_NAME_TOOLE_WIGHT +
                ", eq."
                + EquipmentContract.EquipmentEntry.COLUMN_TOOLE_DESCRIPTION +
                ", sour."
                + EquipmentContract.SourceEntry.COLUMN_NAME +
                ", eq."
                + EquipmentContract.EquipmentEntry.COLUMN_CATEGORY_ID +
                ", eq."
                + EquipmentContract.EquipmentEntry.COLUMN_TYPE_ID +
                ", eq."
                + EquipmentContract.EquipmentEntry.COLUMN_TOOLE_SOURCE +
                " FROM "
                + EquipmentContract.EquipmentEntry.TABLE_NAME +
                " eq INNER JOIN "
                + EquipmentContract.TypeEntry.TABLE_NAME +
                " typ , "
                + EquipmentContract.CoinEntry.TABLE_NAME +
                " con , "
                + EquipmentContract.CategoryEntry.TABLE_NAME +
                " cat , "
                + EquipmentContract.SourceEntry.TABLE_NAME +
                " sour ON eq."
                + EquipmentContract.EquipmentEntry.COLUMN_COIN_ID +
                " = con."
                + EquipmentContract.CoinEntry._ID +
                " AND eq."
                + EquipmentContract.EquipmentEntry.COLUMN_CATEGORY_ID +
                " = cat."
                + EquipmentContract.CategoryEntry._ID +
                " AND eq."
                + EquipmentContract.EquipmentEntry.COLUMN_TYPE_ID +
                " = typ."
                + EquipmentContract.TypeEntry._ID +
                " AND eq."
                + EquipmentContract.EquipmentEntry.COLUMN_TOOLE_SOURCE +
                " = sour."
                + EquipmentContract.SourceEntry._ID +
                " ;"
    )
    fun getEquipmentTable(): ArrayList<TooleEntity>

    @Query("SELECT "
            + EquipmentContract.CategoryEntry.COLUMN_NAME +
            " FROM "
            + EquipmentContract.CategoryEntry.TABLE_NAME + " ;"
    )
    fun loadEquipmentType(): ArrayList<String>


    @Query("SELECT "
            + EquipmentContract.TypeEntry.COLUMN_NAME +
            " FROM "
            + EquipmentContract.TypeEntry.TABLE_NAME.toString() + " ;"
    )
    fun loadEquipmentSubtype(): ArrayList<String>


    @Insert
    fun insertEquipment(
        category_id: Int,
        toole_name: String,
        toole_price: Int,
        coin_id: Int,
        toole_wight: String,
        toole_description: String,
        toole_source: Int,
        type_id: Int
    )

    @Delete
    fun deleteEquipment(id: Int)
}