package com.dolivdev.helperdnd.presenter.toollist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dolivdev.helperdnd.domain.entity.equipnet.EquipmentEntity

class EquipmentListViewModel : ViewModel() {
    init {

    }
    lateinit var arrayList : MutableLiveData<ArrayList<EquipmentEntity>>

    fun getArrayEntity() : LiveData<ArrayList<EquipmentEntity>>{
        return arrayList
    }

}