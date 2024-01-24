package com.muskan.wavesoffood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muskan.wavesoffood.databinding.ActivitySingUpBinding

class SingUpActivity : AppCompatActivity() {
    private val binding:ActivitySingUpBinding by lazy {
        ActivitySingUpBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.alreadyhavebutton.setOnClickListener {
            var intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}