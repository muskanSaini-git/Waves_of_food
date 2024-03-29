package com.muskan.wavesoffood

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.muskan.wavesoffood.adapters.MenuAdapter
import com.muskan.wavesoffood.databinding.FragmentMenuBottomSheetBinding


class MenuBottomSheetFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentMenuBottomSheetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentMenuBottomSheetBinding.inflate(layoutInflater, container, false)
        binding.buttonBack.setOnClickListener {
            dismiss()
        }
        val menuFoodName= listOf("Burger","Sandwich","Ice Cream", "Mamo", "Spacy fresh crab", "Spacy fresh crab", "Spacy fresh crab", "Ice Cream","Rabadi")
        val menuItemPrice= listOf("$5","$7","$8","$9","$6","$6","$6","$6","$88")
        val menuImage= listOf(
            R.drawable.menu1,
            R.drawable.menu2,
            R.drawable.menu3,
            R.drawable.menu4,
            R.drawable.menu5,
            R.drawable.menu6,
            R.drawable.menu5,
            R.drawable.menu3,
            R.drawable.menu2

        )
        val adapter= MenuAdapter(ArrayList(menuFoodName),ArrayList(menuItemPrice),ArrayList(menuImage),requireActivity())
        binding.menuRecyclerView.layoutManager= LinearLayoutManager(requireContext())
        binding.menuRecyclerView.adapter=adapter
        return binding.root

    }

    companion object {

    }
}