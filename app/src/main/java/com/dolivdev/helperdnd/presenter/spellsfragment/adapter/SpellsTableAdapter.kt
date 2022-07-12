package com.dolivdev.helperdnd.presenter.spellsfragment.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView

import com.dolivdev.helperdnd.databinding.SpellRecycleLayoutBinding


class SpellsTableAdapter : RecyclerView.Adapter<SpellsTableAdapter.SpellViewHolder>() {

    private val spellViewHolders: MutableList<SpellViewHolder> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpellViewHolder {
        val binding = SpellRecycleLayoutBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        val holder = SpellViewHolder(binding.root, binding)

        spellViewHolders.add(holder)
        return holder
    }

    override fun onBindViewHolder(holder: SpellViewHolder, position: Int) {
        holder.bind()//TODO entity
    }

    override fun getItemCount(): Int {
        return spellViewHolders.size
    }
     class SpellViewHolder(itemView: View, private val binding: SpellRecycleLayoutBinding) : RecyclerView.ViewHolder(itemView) {
         fun bind() {}
    }

}