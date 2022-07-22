package com.dolivdev.helperdnd.presenter.toollist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dolivdev.helperdnd.domain.entity.equipnet.EquipDataEntity
import com.dolivdev.helperdnd.domain.usecase.equipment.FilterSearchEquipmentUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class EquipmentListViewModel @Inject constructor(
    private val filterSearchEquipmentUseCase: FilterSearchEquipmentUseCase
) : ViewModel() {
    val arrayList: MutableLiveData<ArrayList<EquipDataEntity.EquipmentEntity>> = MutableLiveData()
    init {
        arrayList.value = filterSearchEquipmentUseCase.getList()
    }



    fun getArrayEntity(): LiveData<ArrayList<EquipDataEntity.EquipmentEntity>> {
        return arrayList
    }

}