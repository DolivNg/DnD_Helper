package com.dolivdev.helperdnd.data

import android.content.Context
import androidx.room.Room
import com.dolivdev.helperdnd.data.equipment.dao.EquipmentDao
import com.dolivdev.helperdnd.data.equipment.dao.EquipmentDatabase
import com.dolivdev.helperdnd.domain.entity.equipnet.EquipDataEntity
import com.dolivdev.helperdnd.domain.entity.equipnet.EquipmentEntits
import com.dolivdev.helperdnd.domain.repositoryes.EquipmentRepository

class EquipmentRepositoryImpl(context: Context) : EquipmentRepository {
    private val equipmentDao: EquipmentDao
    private var db: EquipmentDatabase

    init {
        db = Room.databaseBuilder(
            context,
            EquipmentDatabase::class.java,
            "equipment"
        ).createFromAsset("equipmentTable.db")
            .build()
        equipmentDao = db.equipmentDao()
    }


    override fun getEquipmentEntityList(): ArrayList<EquipDataEntity.EquipmentEntity> {
        return ArrayList<EquipDataEntity.EquipmentEntity>()// equipmentDao.getEquipmentTable()

    }

    override fun getEquipmentTypeList(): ArrayList<String> {
        TODO("Not yet implemented")
    }

    override fun getEquipmentSubtypeList(): ArrayList<String> {
        TODO("Not yet implemented")
    }

    override fun setEquipment(equipmentEntity: EquipDataEntity.EquipmentEntity) {
        TODO("Not yet implemented")
    }

    override fun removeEquipment(id: Int) {
        TODO("Not yet implemented")
    }


}