package com.muskan.wavesoffood.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.muskan.wavesoffood.R
import com.muskan.wavesoffood.adapters.BuyAgainAdapter
import com.muskan.wavesoffood.databinding.FragmentHistoryBinding


class HistoryFragment : Fragment() {
    private lateinit var binding: FragmentHistoryBinding
    private lateinit var buyAgainAdapter: BuyAgainAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding=FragmentHistoryBinding.inflate(layoutInflater, container, false)
        setUpRecyclerView()
        return binding.root
    }
private fun setUpRecyclerView(){
    val buyAgainFoodName= arrayListOf("Food 2","Food3","Food4")
    val buyAgainFoodPrice= arrayListOf("$2","$8","$9")
    val buyAgainFoodImage= arrayListOf(R.drawable.menu1,R.drawable.menu2,R.drawable.menu3)
    buyAgainAdapter= BuyAgainAdapter(buyAgainFoodName,buyAgainFoodPrice,buyAgainFoodImage)
    binding.buyAgainFoodRecycler.adapter=buyAgainAdapter
    binding.buyAgainFoodRecycler.layoutManager=LinearLayoutManager(requireContext())
}
    companion object {


    }
}