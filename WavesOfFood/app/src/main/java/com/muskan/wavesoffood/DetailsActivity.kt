package com.muskan.wavesoffood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muskan.wavesoffood.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
     private lateinit var binding:ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val foodname=intent.getStringExtra("MenuItemName")
        val foodImage=intent.getIntExtra("MenuItemImage",0)
        binding.detailsFoodName.text=foodname
        binding.detailsFoodImage.setImageResource(foodImage)
        binding.imagebutton.setOnClickListener {
            finish()
        }
    }
}