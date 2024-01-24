package com.muskan.wavesoffood.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.car.ui.toolbar.MenuItem.OnClickListener
import com.muskan.wavesoffood.DetailsActivity
import com.muskan.wavesoffood.databinding.MenuItemBinding

class MenuAdapter(private val menuItemName: List<String>, private val menuItemPrice: List<String>, private val MenuImage: List<Int>,private val requiredActivity:Context):RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

private val itemClickListener:OnClickListener?=null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val binding=MenuItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    return MenuViewHolder(binding)
    }




    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
       holder.bind(position)
    }
    override fun getItemCount(): Int =menuItemName.size
    inner class MenuViewHolder(private val binding:MenuItemBinding):RecyclerView.ViewHolder(binding.root){
       init {
           binding.root.setOnClickListener {
               val postition=adapterPosition
               if (postition!=RecyclerView.NO_POSITION){
                   itemClickListener.onItemClick(postition)
               }
               //set onclicklistner to open details
               val intent=Intent(requiredActivity,DetailsActivity::class.java)
               intent.putExtra("MenuItemName",menuItemName.get(position))
               intent.putExtra("MenuItemImage",MenuImage.get(position))
               requiredActivity.startActivity(intent)

           }
       }
        fun bind(position: Int) {
            binding.apply {
                menuFoodName.text = menuItemName[position]
                menuPrice.text = menuItemPrice[position]
                menuImage.setImageResource(MenuImage[position])

            }

        }

    }
}

private fun OnClickListener?.onItemClick(postition: Int) {


}
