package com.ukadovlad21.noteapp

import android.app.AlertDialog
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.DialogFragment
import com.ukadovlad21.noteapp.databinding.DialogCreateNotesBinding

class CreateNoteDialog : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val binding = DialogCreateNotesBinding.inflate(LayoutInflater.from(context))

        val builder = AlertDialog.Builder(requireContext())
        builder.setView(binding.root)

        val dialog = builder.create()
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        return dialog

    }
}