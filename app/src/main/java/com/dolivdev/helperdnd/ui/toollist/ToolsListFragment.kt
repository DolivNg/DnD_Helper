package com.dolivdev.helperdnd.ui.toollist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

import com.dolivdev.helperdnd.databinding.FragmentToollistBinding

class ToolsListFragment : Fragment() {

    private var _binding: FragmentToollistBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
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
        //_binding.recyclerTooleTable.adapter =

        toolListViewModel.text.observe(viewLifecycleOwner) {

        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}