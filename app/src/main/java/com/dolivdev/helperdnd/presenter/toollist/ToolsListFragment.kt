package com.dolivdev.helperdnd.presenter.toollist


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import com.dolivdev.helperdnd.databinding.FragmentToollistBinding
import com.dolivdev.helperdnd.presenter.toollist.adapter.EquipmentRecycleAdapter
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel

@AndroidEntryPoint
class ToolsListFragment : Fragment() {
    val vm : EquipmentListViewModel by viewModels()
    private var _binding: FragmentToollistBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentToollistBinding.inflate(inflater, container, false)
        val root: View = binding.root
        //val adapter = EquipmentRecycleAdapter()

        vm.getArrayEntity().observe(viewLifecycleOwner) {
            binding.recyclerToole.adapter = EquipmentRecycleAdapter(it)
        }

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


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}