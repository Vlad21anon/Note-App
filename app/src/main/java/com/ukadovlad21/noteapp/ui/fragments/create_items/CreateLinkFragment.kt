package com.ukadovlad21.noteapp.ui.fragments.create_items

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ukadovlad21.noteapp.R
import com.ukadovlad21.noteapp.ui.toolbars.TitleToolbarHelper
import com.ukadovlad21.noteapp.databinding.FragmentCreateLinkBinding

class CreateLinkFragment : Fragment() {

    private lateinit var binding: FragmentCreateLinkBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentCreateLinkBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupToolbar()

    }

    private fun setupToolbar() {
        val toolbarHelper = TitleToolbarHelper(
            binding.toolbarCreateLink,
            R.id.action_createLinkFragment_to_listOfAllNotesFragment
        )

        toolbarHelper.setupClickListeners()
    }

}


