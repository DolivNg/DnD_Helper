package com.dolivdev.helperdnd.domain.usecase.equipment

import android.widget.Filter
import android.widget.Filterable
import com.dolivdev.helperdnd.domain.entity.equipnet.EquipDataEntity
import com.dolivdev.helperdnd.domain.repositoryes.EquipmentRepository
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList

class FilterSearchEquipmentUseCase @Inject constructor(private val equipRep : EquipmentRepository) : Filterable {
    fun getList(): ArrayList<EquipDataEntity.EquipmentEntity>{
       return equipRep.getEquipmentEntityList()
    }

    override fun getFilter(): Filter {
        TODO("Not yet implemented")
    }

    private val equipmentFilter: Filter = object : Filter() {
        override fun performFiltering(constraint: CharSequence): FilterResults {
            val filteredList: MutableList<EquipDataEntity.EquipmentEntity> = ArrayList()
            if (constraint.isEmpty()) {
                //filteredList.addAll(equipmentTableListFull)
            } else {
                val filterPattern =
                    constraint.toString().lowercase(Locale.getDefault()).trim { it <= ' ' }
                /*for (item in equipmentTableListFull) {
                    if (item.getName().toLowerCase().contains(filterPattern)) {
                        filteredList.add(item)
                    }
                }*/
            }
            val results = FilterResults()
            results.values = filteredList
            return results
        }

        override fun publishResults(constraint: CharSequence, results: FilterResults) {
            /*equipmentTableArrayList.clear()
            equipmentTableArrayList.addAll(results.values as List<*>)*/

        }
    }


}