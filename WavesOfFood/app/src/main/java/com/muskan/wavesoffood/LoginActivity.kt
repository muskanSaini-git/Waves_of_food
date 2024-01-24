package com.muskan.wavesoffood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.muskan.wavesoffood.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private val binding:ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
       binding.login.setOnClickListener {
           var intent=Intent(this,MainActivity::class.java)
           startActivity(intent)
       }
        binding.donthavebutton.setOnClickListener {
            var intent=Intent(this,SingUpActivity::class.java)
            startActivity(intent)
        }
    }
}