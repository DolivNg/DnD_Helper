package com.dolivdev.helperdnd.presenter.spellsfragment.descriptionfragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dolivdev.helperdnd.domain.entity.spells.SpellEntity

class SpellDescriptionSharedModelView : ViewModel() {

    private lateinit var spellEntity : MutableLiveData<SpellEntity>

    fun getSpellEntity() : LiveData<SpellEntity> {
        return spellEntity
    }
}