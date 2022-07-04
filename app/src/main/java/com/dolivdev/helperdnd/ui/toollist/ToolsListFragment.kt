package com.dolivdev.helperdnd.ui.toollist


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.dolivdev.helperdnd.R
import com.dolivdev.helperdnd.databinding.FragmentToollistBinding
import com.dolivdev.helperdnd.domain.entity.TooleEntity
import com.dolivdev.helperdnd.ui.toollist.adapter.TooleTableAdapter


class ToolsListFragment : Fragment() {

    private var _binding: FragmentToollistBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val toolListViewModel =
            ViewModelProvider(this).get(ToolListViewModel::class.java)

        _binding = FragmentToollistBinding.inflate(inflater, container, false)
        val root: View = binding.root

        _binding!!.recyclerToole.adapter = TooleTableAdapter()

        toolListViewModel.getArrayEntity().observe(viewLifecycleOwner) {
            //_binding!!.recyclerToole.adapter.//.setTooleListArrayList(it)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}