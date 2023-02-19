package com.ukadovlad21.noteapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.ukadovlad21.noteapp.R
import com.ukadovlad21.noteapp.ui.adapters.ViewPagerAdapter
import com.ukadovlad21.noteapp.databinding.FragmentListOfAllNotesBinding
import com.ukadovlad21.noteapp.ui.dialogs.CreateNoteDialog

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

        setupTabLayout()
    }

    private fun setupTabLayout() {
        val adapter = ViewPagerAdapter(parentFragmentManager)
        addFragmentToViewPagerAdapter(adapter)
        binding.tabLayout.setupWithViewPager(binding.viewPager)
        binding.viewPager.adapter = adapter
    }

    private fun addFragmentToViewPagerAdapter(adapter: ViewPagerAdapter) {
        adapter.addFragment(Fragment(), "ALL")
        adapter.addFragment(Fragment(), "Notes")
        adapter.addFragment(Fragment(), "Lists")
        adapter.addFragment(Fragment(), "Links")
        adapter.addFragment(Fragment(), "Draws")
        adapter.addFragment(Fragment(), "Photos")
        adapter.addFragment(Fragment(), "Audio")
        adapter.addFragment(Fragment(), "Files")

    }

    private fun setupClickListeners() {
        binding.ibCreateNoteItem.setOnClickListener {
            val dialog = CreateNoteDialog()
            dialog.show(parentFragmentManager, "Create_note_dialog_tag")
        }

        binding.toolbarMain.ibSearch.setOnClickListener {
            findNavController().navigate(R.id.action_listOfAllNotesFragment_to_findNoteFragment)
        }

        binding.toolbarMain.ibMore.setOnClickListener {
            binding.drawerLayout.open()
        }

        binding.toolbarMain.ibSort.setOnClickListener {
            dialogSortNotesSetup()
        }
    }

    private fun dialogSortNotesSetup() {
        val dialog = BottomSheetDialog(requireContext())
        dialog.setContentView(R.layout.dialog_sort_notes)
        dialog.show()
    }

}


