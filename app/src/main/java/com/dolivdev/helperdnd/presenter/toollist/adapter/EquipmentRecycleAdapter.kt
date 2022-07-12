package com.dolivdev.helperdnd.presenter.toollist.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dolivdev.helperdnd.R
import com.dolivdev.helperdnd.databinding.EquipmentRecycleLayoutBinding

import com.dolivdev.helperdnd.databinding.SpellRecycleLayoutBinding
import com.dolivdev.helperdnd.domain.entity.TooleEntity

class EquipmentRecycleAdapter : RecyclerView.Adapter<EquipmentRecycleAdapter.EquipmentHolder>() {
    private var tooleArrayList: List<TooleEntity> = ArrayList()
    private val tooleViewHolders: MutableList<EquipmentHolder> = ArrayList()

    fun setTooleListArrayList(tooleEntityList: List<TooleEntity>) {
        this.tooleArrayList = tooleEntityList
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EquipmentHolder {
        val binding = EquipmentRecycleLayoutBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        val holder = EquipmentHolder(binding.root, binding)

        tooleViewHolders.add(holder)
        return holder
    }

    override fun onBindViewHolder(holder: EquipmentHolder, position: Int) {
        holder.bind(tooleArrayList[position])
    }

    override fun getItemCount(): Int {
        return tooleArrayList.size
    }

    inner class EquipmentHolder(view: View, private val binding: EquipmentRecycleLayoutBinding) :
        RecyclerView.ViewHolder(view), View.OnClickListener {

        fun bind(tooleEntity: TooleEntity) {
            binding.tVNameToole.text = tooleEntity.NameToole
            binding.tVDescriptionToole.text = tooleEntity.DescriptionToole
            binding.tVPriceToole.text = tooleEntity.PriceToole
            binding.tVWightToole.text = tooleEntity.WeightToole

            if (tooleEntity.VisibleToole) {
                if (tooleEntity.HomeBrew) {

                }
            }
            //binding.tVDescriptionToole.visibility = tooleEntity.
        }

        override fun onClick(view: View) {
            when (view.id) {
                R.id.imVDelete -> {

                }
            }
        }
    }


}

