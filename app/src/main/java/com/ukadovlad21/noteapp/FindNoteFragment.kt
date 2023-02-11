package com.ukadovlad21.noteapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
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

        makeFocusOnEditText(requireContext(), binding.toolbarFind.tietSearch)

    }

    private fun makeFocusOnEditText(context: Context, editText: EditText) {
        editText.requestFocus()

        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT)
    }
}

