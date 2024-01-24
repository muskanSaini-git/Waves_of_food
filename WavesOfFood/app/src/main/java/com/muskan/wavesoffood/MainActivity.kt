package com.muskan.wavesoffood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.muskan.wavesoffood.databinding.ActivityMainBinding
import com.muskan.wavesoffood.fragment.NotificationBottomFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val NavController=findNavController(R.id.fragmentContainerView)
        val bottomnav=findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomnav.setupWithNavController(NavController)
           binding.notificationbutton.setOnClickListener {
               val bottomSheetDialog=NotificationBottomFragment()
               bottomSheetDialog.show(supportFragmentManager,"Test")
           }
    }
}