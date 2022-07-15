package com.dolivdev.helperdnd.presenter.toollist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dolivdev.helperdnd.domain.entity.equipnet.TooleEntity

class ToolListViewModel : ViewModel() {
    lateinit var arrayList : MutableLiveData<TooleEntity>

    fun getArrayEntity() : LiveData<TooleEntity>{
        return arrayList
    }

}