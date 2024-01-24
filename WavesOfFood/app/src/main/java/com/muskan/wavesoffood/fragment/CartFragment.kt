package com.muskan.wavesoffood.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.muskan.wavesoffood.CongratBottomSheetFragment
import com.muskan.wavesoffood.PayOutActivity
import com.muskan.wavesoffood.R
import com.muskan.wavesoffood.adapters.CartAdapter
import com.muskan.wavesoffood.databinding.FragmentCartBinding


class CartFragment : Fragment() {
      private lateinit var binding: FragmentCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding=FragmentCartBinding.inflate(layoutInflater, container, false)
        val cartFoodName= listOf("Burger","Sandwich","Ice Cream", "Mamo", "Spacy fresh crab", "Spacy fresh crab", "Spacy fresh crab", "Ice Cream","Rabadi")
        val cartItemPrice= listOf("$5","$7","$8","$9","$6","$6","$6","$6","$88")
        val cartImage= listOf(
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
        val adapter=CartAdapter(ArrayList(cartFoodName),ArrayList(cartItemPrice),ArrayList(cartImage))
        binding.cartRecyclarView.layoutManager=LinearLayoutManager(requireContext())
        binding.cartRecyclarView.adapter=adapter
        binding.ProceedButtonCart.setOnClickListener {
            val intent=Intent(requireContext(),PayOutActivity::class.java)
            startActivity(intent)
        }

        return binding.root
    }

    companion object {

    }
}