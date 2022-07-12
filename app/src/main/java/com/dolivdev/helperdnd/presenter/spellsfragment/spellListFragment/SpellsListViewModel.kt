package com.dolivdev.helperdnd.presenter.spellsfragment.spellListFragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dolivdev.helperdnd.domain.entity.TooleEntity

class SpellsListViewModel : ViewModel() {

    lateinit var arrayList : MutableLiveData<TooleEntity>

    fun getArrayEntity() : LiveData<TooleEntity>{
        return arrayList
    }

}