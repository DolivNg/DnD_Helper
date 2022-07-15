package com.dolivdev.helperdnd.presenter.spellsfragment.spellListFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.dolivdev.helperdnd.databinding.FragmentSpellslistBinding

class SpellsListFragment : Fragment() {

    private var _binding: FragmentSpellslistBinding? = null

    // This property is only valid between onCreateView and

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val spellsViewModel =
            ViewModelProvider(this)[SpellsListViewModel::class.java]

        _binding = FragmentSpellslistBinding.inflate(inflater, container, false)
        val root: View = binding.root

        spellsViewModel.arrayList.observe(viewLifecycleOwner) {

        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}