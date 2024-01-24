package com.muskan.wavesoffood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muskan.wavesoffood.databinding.ActivityPayOutBinding

class PayOutActivity : AppCompatActivity() {
    private lateinit var binding:ActivityPayOutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPayOutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.PlaceMyOrder.setOnClickListener {
            val bottomSheetDialog=CongratBottomSheetFragment()
            bottomSheetDialog.show(supportFragmentManager,"Test")
        }
    }
}