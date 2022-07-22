package com.dolivdev.helperdnd.domain.repositoryes

import com.dolivdev.helperdnd.domain.entity.equipnet.EquipDataEntity

interface EquipmentRepository {
    fun getEquipmentEntityList(): ArrayList<EquipDataEntity.EquipmentEntity>
    fun getEquipmentTypeList(): ArrayList<String>
    fun getEquipmentSubtypeList(): ArrayList<String>

    fun setEquipment(equipmentEntity: EquipDataEntity.EquipmentEntity)
    fun removeEquipment(id: Int)
}