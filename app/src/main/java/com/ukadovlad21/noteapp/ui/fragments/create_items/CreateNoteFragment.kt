package com.ukadovlad21.noteapp.ui.fragments.create_items

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ukadovlad21.noteapp.R
import com.ukadovlad21.noteapp.ui.toolbars.TitleToolbarHelper
import com.ukadovlad21.noteapp.databinding.FragmentCreateNoteBinding

class CreateNoteFragment : Fragment() {

    private lateinit var binding: FragmentCreateNoteBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCreateNoteBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupToolbar()

        binding.toolbarCreateNote.ibMore.setOnClickListener {
            //TODO More
        }

        binding.toolbarCreateNote.ibShare.setOnClickListener {
            //TODO Share
        }

        //TODO binding.etNoteText

    }

    private fun setupToolbar() {
        val toolbarHelper = TitleToolbarHelper(
            binding.toolbarCreateNote,
            R.id.action_fragmentCreateNote_to_listOfAllNotesFragment
        )

        toolbarHelper.setupClickListeners()
    }

}