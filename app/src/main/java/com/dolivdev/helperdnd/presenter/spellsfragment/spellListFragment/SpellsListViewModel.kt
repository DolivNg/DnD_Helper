package com.dolivdev.helperdnd.presenter.spellsfragment.spellListFragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SpellsListViewModel : ViewModel() {

    lateinit var arrayList : MutableLiveData<EquipmentEntity>

    fun getArrayEntity() : LiveData<EquipmentEntity>{
        return arrayList
    }

}