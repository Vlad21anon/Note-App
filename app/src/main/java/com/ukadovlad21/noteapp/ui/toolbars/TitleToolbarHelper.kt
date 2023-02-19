package com.ukadovlad21.noteapp.ui.toolbars

import androidx.navigation.findNavController
import com.ukadovlad21.noteapp.databinding.ToolbarTitleBinding

class TitleToolbarHelper(
    private val binding: ToolbarTitleBinding,
    private val navigation: Int,
) {
    fun setupClickListeners() {
        binding.ibBack.setOnClickListener {
            binding.root.findNavController()
                .navigate(navigation)
        }
        binding.ibShare.setOnClickListener {
            //TODO Share
        }

        binding.ibMore.setOnClickListener {
            //TODO More
        }
        //TODO binding.etTitle
    }
}