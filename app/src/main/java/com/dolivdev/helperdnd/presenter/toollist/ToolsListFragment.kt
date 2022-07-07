package com.dolivdev.helperdnd.presenter.toollist


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.dolivdev.helperdnd.databinding.FragmentToollistBinding
import com.dolivdev.helperdnd.presenter.toollist.adapter.TooleTableAdapter


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