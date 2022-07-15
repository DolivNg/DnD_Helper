package com.dolivdev.helperdnd.presenter.toollist


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.dolivdev.helperdnd.databinding.FragmentToollistBinding
import com.dolivdev.helperdnd.presenter.toollist.adapter.EquipmentRecycleAdapter


class ToolsListFragment : Fragment() {

    private var _binding: FragmentToollistBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val toolListViewModel =
            ViewModelProvider(this)[ToolListViewModel::class.java]

        _binding = FragmentToollistBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.recyclerToole.adapter = EquipmentRecycleAdapter()

        binding.searchTooleView.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            android.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {

                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                // if query text is change in that case we
                // are filtering our adapter with
                // new text on below line.
                //binding.recyclerToole.adapter.filter.filter(newText)

                return false
            }
        } )

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