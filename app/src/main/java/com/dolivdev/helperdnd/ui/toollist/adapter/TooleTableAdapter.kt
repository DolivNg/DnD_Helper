package com.dolivdev.helperdnd.ui.toollist.adapter

import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.dolivdev.helperdnd.R
import com.dolivdev.helperdnd.databinding.FragmentToollistBinding
import com.dolivdev.helperdnd.databinding.RecycleElementTooleBinding
import com.dolivdev.helperdnd.domain.entity.TooleEntity
import com.dolivdev.helperdnd.ui.toollist.ToolsListFragment

class TooleTableAdapter : RecyclerView.Adapter<TooleTableAdapter.TooleHolder>() {
    private var simpleTableArrayList: List<TooleEntity> = ArrayList()
    private val simpleTableViewHolders: MutableList<TooleHolder> = ArrayList()

    fun setTooleListArrayList(tooleEntityList: List<TooleEntity>) {
        this.simpleTableArrayList = tooleEntityList
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TooleHolder {
        val binding =
            RecycleElementTooleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val holder = TooleHolder(binding.root, binding)

        simpleTableViewHolders.add(holder)
        return holder
    }

    override fun onBindViewHolder(holder: TooleHolder, position: Int) {
        holder.bind(simpleTableArrayList[position])
    }

    override fun getItemCount(): Int {
        return simpleTableArrayList.size
    }

    inner class TooleHolder(view: View, private val binding: RecycleElementTooleBinding) :
        RecyclerView.ViewHolder(view), View.OnClickListener {

        init {
            //imVDelete.setOnClickListener(this)
        }

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
                R.id.imVDelete -> {

                }
            }
        }
    }


}

