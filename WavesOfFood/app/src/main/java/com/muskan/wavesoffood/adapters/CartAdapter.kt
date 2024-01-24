package com.muskan.wavesoffood.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muskan.wavesoffood.databinding.CartItemBinding

class CartAdapter(private val cartitems:MutableList<String>,private val cartitemPrice:MutableList<String>,private val cartImage:MutableList<Int>): RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    private val itemQuantites = IntArray(cartitems.size) { 1 }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val binding = CartItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CartViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int =cartitems.size

    inner class CartViewHolder(private val binding: CartItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.apply {
                val quantity = itemQuantites[position]
                foodname.text = cartitems[position]
                foodprice.text = cartitemPrice[position]
                cartimage.setImageResource(cartImage[position])
                cartitemquantity.text = quantity.toString()
                minusButton.setOnClickListener {
                decreasaQuantites(position)

                }
                plusButton.setOnClickListener {
                    increaseQuantites(position)

                }
                deletebutton.setOnClickListener {
                    val itemPosition =adapterPosition
                    if (itemPosition!=RecyclerView.NO_POSITION){
                        deleteItem(itemPosition)
                    }
                }
            }
        }

       private fun decreasaQuantites(position: Int) {
            if (itemQuantites[position] > 1) {
                itemQuantites[position]--
                binding.cartitemquantity.text = itemQuantites[position].toString()
            }

        }

       private fun increaseQuantites(position: Int) {
            if (itemQuantites[position] < 18) {
                itemQuantites[position]++
                binding.cartitemquantity.text = itemQuantites[position].toString()
            }
        }

       private fun deleteItem(position: Int) {
            cartitems.removeAt(position)
            cartImage.removeAt(position)
            cartitemPrice.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, cartitems.size)


        }
    }
}





