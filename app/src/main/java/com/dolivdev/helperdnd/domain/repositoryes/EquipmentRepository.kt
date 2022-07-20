package com.dolivdev.helperdnd.domain.repositoryes

import com.dolivdev.helperdnd.domain.entity.equipnet.EquipmentEntity

interface EquipmentRepository {
    fun getEquipmentEntityList(): ArrayList<EquipmentEntity>
    fun getEquipmentTypeList(): ArrayList<String>
    fun getEquipmentSubtypeList(): ArrayList<String>

    fun setEquipment(equipmentEntity: EquipmentEntity)
    fun removeEquipment(id: Int)
}