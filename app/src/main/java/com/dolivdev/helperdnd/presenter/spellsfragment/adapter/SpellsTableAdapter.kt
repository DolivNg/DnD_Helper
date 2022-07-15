package com.dolivdev.helperdnd.presenter.spellsfragment.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView

import com.dolivdev.helperdnd.databinding.SpellRecycleLayoutBinding
import com.dolivdev.helperdnd.domain.entity.spells.SpellEntity


class SpellsTableAdapter : RecyclerView.Adapter<SpellsTableAdapter.SpellViewHolder>() {
    private var spellArrayList: List<SpellEntity> = ArrayList()
    private val spellViewHolders: MutableList<SpellViewHolder> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpellViewHolder {
        val binding = SpellRecycleLayoutBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        val holder = SpellViewHolder(binding.root, binding)

        spellViewHolders.add(holder)
        return holder
    }

    override fun onBindViewHolder(holder: SpellViewHolder, position: Int) {
        holder.bind(spellArrayList[position])//TODO entity
    }

    override fun getItemCount(): Int {
        return spellViewHolders.size
    }
     class SpellViewHolder(itemView: View, private val binding: SpellRecycleLayoutBinding) : RecyclerView.ViewHolder(itemView) {
         fun bind(spellEntity: SpellEntity) {
             binding.tVSpellLevel.text = spellEntity.stLevel
             binding.tVSpellName.text = spellEntity.name
             binding.tVSpellSchool.text = spellEntity.stSchool
             binding.tVSpellSource.text = spellEntity.stSource
             binding.spellLinerLayout.setOnClickListener {  }
             binding.checkBoxSpell.setOnClickListener {  }
         }
    }

}