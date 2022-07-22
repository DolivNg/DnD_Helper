package com.dolivdev.helperdnd.data.equipment.dao

import androidx.room.*
import com.dolivdev.helperdnd.domain.entity.equipnet.EquipDataEntity
import com.dolivdev.helperdnd.domain.entity.equipnet.EquipmentEntits

@Dao
interface EquipmentDao {

    @Query("select * from equipment")
    fun getEquipmentTable(): ArrayList<EquipDataEntity.EquipmentEntity>

    @Insert
    fun insertEquipment(entity: EquipDataEntity.EquipmentEntity)

    @Delete
    fun deleteEquipment(entity: EquipDataEntity.EquipmentEntity)
}