package com.dolivdev.helperdnd.data

import android.content.Context
import androidx.room.Room
import com.dolivdev.helperdnd.data.equipment.dao.EquipmentDao
import com.dolivdev.helperdnd.data.equipment.dao.EquipmentDatabase
import com.dolivdev.helperdnd.domain.entity.equipnet.EquipmentEntity
import com.dolivdev.helperdnd.domain.repositoryes.EquipmentRepository

class EquipmentRepositoryImpl(context: Context) : EquipmentRepository {
    private val equipmentDao: EquipmentDao

    init {
        val db = Room.databaseBuilder(
            context,
            EquipmentDatabase::class.java,
            "equipmentTable.db"
        ).build()
        equipmentDao = db.equipmentDao()
    }


    override fun getEquipmentEntityList(): ArrayList<EquipmentEntity> {
        return equipmentDao.getEquipmentTable()
        //val users: List<User> = userDao.getAll()
        TODO("Not yet implemented")

    }

    override fun getEquipmentTypeList(): ArrayList<String> {
        TODO("Not yet implemented")
    }

    override fun getEquipmentSubtypeList(): ArrayList<String> {
        TODO("Not yet implemented")
    }

    override fun setEquipment(equipmentEntity: EquipmentEntity) {
        TODO("Not yet implemented")
    }

    override fun removeEquipment(id: Int) {
        TODO("Not yet implemented")
    }


}