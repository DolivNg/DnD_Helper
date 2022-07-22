package com.dolivdev.helperdnd.presenter.toollist.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dolivdev.helperdnd.R
import com.dolivdev.helperdnd.databinding.EquipmentRecycleLayoutBinding
import com.dolivdev.helperdnd.domain.entity.equipnet.EquipDataEntity

class EquipmentRecycleAdapter(var equipmentArrayList: ArrayList<EquipDataEntity.EquipmentEntity>) : RecyclerView.Adapter<EquipmentRecycleAdapter.EquipmentHolder>() {


    private val equipmentViewHolders: MutableList<EquipmentHolder> = ArrayList()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EquipmentHolder {
        val binding = EquipmentRecycleLayoutBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        val holder = EquipmentHolder(binding.root, binding)

        equipmentViewHolders.add(holder)

        return holder
    }

    override fun onBindViewHolder(holder: EquipmentHolder, position: Int) {
        holder.bind(equipmentArrayList[position])
    }

    override fun getItemCount(): Int {
        return equipmentArrayList.size
    }

    inner class EquipmentHolder(view: View, private val binding: EquipmentRecycleLayoutBinding) :
        RecyclerView.ViewHolder(view), View.OnClickListener {

        fun bind(tooleEntity: EquipDataEntity.EquipmentEntity) {
            binding.tVNameToole.text = tooleEntity.nameTool
            binding.tVDescriptionToole.text = tooleEntity.descriptionTool
            binding.tVPriceToole.text = tooleEntity.priceTool.toString()
            binding.tVWightToole.text = tooleEntity.weightTool
            /*
            if (tooleEntity.VisibleToole) {
                if (tooleEntity.HomeBrew) {

                }
            }*/
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

