package com.ukadovlad21.noteapp

import android.app.AlertDialog
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.ukadovlad21.noteapp.databinding.DialogCreateNotesBinding

class CreateNoteDialog : DialogFragment() {
    private val binding by lazy {
        DialogCreateNotesBinding.inflate(LayoutInflater.from(context))
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder = AlertDialog.Builder(requireContext())
        builder.setView(binding.root)

        val dialog = builder.create()

        setupCreateNoteDialogClickListeners()

        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        return dialog

    }

    private fun setupCreateNoteDialogClickListeners() {
        binding.llTypeNote.setOnClickListener {
            dialog?.dismiss()
            findNavController().navigate(R.id.action_listOfAllNotesFragment_to_fragmentCreateNote)
        }
    }
}
