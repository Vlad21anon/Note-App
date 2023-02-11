package com.ukadovlad21.noteapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.ukadovlad21.noteapp.databinding.FragmentListOfAllNotesBinding

class ListOfAllNotesFragment : Fragment() {
    private val binding: FragmentListOfAllNotesBinding by lazy {
        FragmentListOfAllNotesBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupClickListeners()

    }

    private fun setupClickListeners() {
        binding.ibCreateNoteItem.setOnClickListener {
            val dialog = CreateNoteDialog()
            dialog.show(parentFragmentManager, "Create_note_dialog_tag")
        }

        binding.toolbarMain.ibSearch.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_listOfAllNotesFragment_to_findNoteFragment)
        }

        binding.toolbarMain.ibMore.setOnClickListener {
            binding.drawerLayout.open()
        }

        binding.toolbarMain.ibSort.setOnClickListener {
            dialogSetup(requireContext())
        }
    }

    private fun dialogSetup(context: Context) {
        val dialog = BottomSheetDialog(context)
        dialog.setContentView(R.layout.dialog_sort_notes)
        dialog.show()
    }

}


