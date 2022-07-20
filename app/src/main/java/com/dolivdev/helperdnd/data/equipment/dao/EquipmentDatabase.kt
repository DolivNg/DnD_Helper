package com.dolivdev.helperdnd.data.equipment.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dolivdev.helperdnd.domain.entity.equipnet.EquipmentEntity

@Database(entities = [EquipmentEntity::class], version = 1)
abstract class EquipmentDatabase : RoomDatabase() {
    abstract fun equipmentDao(): EquipmentDao
}