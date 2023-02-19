package com.ukadovlad21.noteapp.ui.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import com.ukadovlad21.noteapp.ui.adapters.ViewPagerAdapter
import com.ukadovlad21.noteapp.databinding.FragmentFindNoteBinding

class FindNoteFragment : Fragment() {
    private lateinit var binding: FragmentFindNoteBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentFindNoteBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupTabLayout()

        makeFocusOnEditText(requireContext(), binding.toolbarFind.tietSearch)

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


    private fun makeFocusOnEditText(context: Context, editText: EditText) {
        editText.requestFocus()

        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT)
    }
}

