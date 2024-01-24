package com.muskan.wavesoffood.adapters

import android.content.Context
import android.content.Intent
import android.media.Image
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muskan.wavesoffood.DetailsActivity
import com.muskan.wavesoffood.databinding.FragmentHomeBinding
import com.muskan.wavesoffood.databinding.PopularItemBinding

class PopularAdapter(private val items:List<String>,private val price:List<String>,private val image:List<Int>,private val requiredActivity:Context):RecyclerView.Adapter<PopularAdapter.PouplerViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PouplerViewHolder {
        return PouplerViewHolder(PopularItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }


    override fun onBindViewHolder(holder: PouplerViewHolder, position: Int) {
        val item=items[position]
        val images=image[position]
        val price=price[position]
        holder.bind(item,price,images)
        holder.itemView.setOnClickListener {
            val intent= Intent(requiredActivity, DetailsActivity::class.java)
            intent.putExtra("MenuItemName",item)
            intent.putExtra("MenuItemImage",images)
            requiredActivity.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
       return items.size
    }
    class PouplerViewHolder(private val binding: PopularItemBinding):RecyclerView.ViewHolder(binding.root) {
        private val imageView=binding.imagepopular
        fun bind(item: String,price: String, image: Int) {
            binding.foodnamepopular.text=item
            binding.pricepopular.text=price
           imageView.setImageResource(image)

        }

    }


}