package com.ukadovlad21.noteapp

import android.opengl.Visibility
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.navigation.NavigationView
import com.ukadovlad21.noteapp.databinding.FragmentListOfAllNotesBinding

class ListOfAllNotesFragment : Fragment() {
    private lateinit var binding: FragmentListOfAllNotesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentListOfAllNotesBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val sortNavigationView = binding.sortNavigationView
        val bottomSheetBehavior = BottomSheetBehavior.from(sortNavigationView)
        bottomSheetBehavior.state = BottomSheetBehavior.STATE_HIDDEN


        binding.toolbarMain.ibSort.setOnClickListener {
//            sortNavigationView.visibility = View.VISIBLE
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_HALF_EXPANDED
        }


    }

}