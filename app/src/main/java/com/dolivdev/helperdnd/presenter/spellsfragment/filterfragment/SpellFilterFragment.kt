package com.dolivdev.helperdnd.presenter.spellsfragment.filterfragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dolivdev.helperdnd.R

class SpellFilterFragment : Fragment() {

    companion object {
        fun newInstance() = SpellFilterFragment()
    }

    private lateinit var viewModel: SpellFilterViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_spell_filter, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SpellFilterViewModel::class.java)
        // TODO: Use the ViewModel
    }

}