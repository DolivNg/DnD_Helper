package com.dolivdev.helperdnd.presenter.spellsfragment.descriptionfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.dolivdev.helperdnd.databinding.FragmentSpellDescriptionBinding


class SpellDescriptionFragment : Fragment() {
    private var _binding: FragmentSpellDescriptionBinding? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        val spellsViewModel =
            ViewModelProvider(this)[SpellDescriptionSharedModelView::class.java]
        spellsViewModel.getSpellEntity().observe(viewLifecycleOwner){
            binding.tVSpellDescription.text = it.description
            binding.tVMComponent.text = it.matComponents
            binding.tVTimeCast.text = it.timeCast
            binding.tVSpellsName.text = it.name
            binding.tVLevelSpell.text = it.stLevel
            binding.tVDuration.text = it.duration
            binding.tVDistance.text = it.distance
            binding.tVComponent.text = it.components
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}