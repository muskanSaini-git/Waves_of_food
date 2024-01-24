package com.muskan.wavesoffood.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muskan.wavesoffood.databinding.ButAgainItemBinding

class BuyAgainAdapter(private val buyAgainFood:ArrayList<String>,private val buyAgainFoodPrice:ArrayList<String>,private val buyAgainFoodImage:ArrayList<Int>):RecyclerView.Adapter<BuyAgainAdapter.BuyAgainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuyAgainViewHolder {
       val binding=ButAgainItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return BuyAgainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BuyAgainViewHolder, position: Int) {
        holder.bind(buyAgainFood[position],buyAgainFoodPrice[position],buyAgainFoodImage[position])
    }

    override fun getItemCount(): Int =buyAgainFood.size
    class BuyAgainViewHolder(private val binding: ButAgainItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(foodName: String, foodPrice: String, foodImage: Int) {
              binding.buyAgainFoodName.text=foodName
            binding.buyAgainFoodPrice.text=foodPrice
            binding.buyAgainFoodImage.setImageResource(foodImage)
        }

    }
}
