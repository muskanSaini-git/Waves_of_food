package com.muskan.wavesoffood.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.muskan.wavesoffood.R
import com.muskan.wavesoffood.adapters.NotificationAdapter
import com.muskan.wavesoffood.databinding.FragmentNotificationBottomBinding


class NotificationBottomFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentNotificationBottomBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentNotificationBottomBinding.inflate(layoutInflater, container, false)
        val notification= listOf("Your order had been Canceled Successfully","Order has been taken by the driver","Congrats Your Order Placed")
        val notificationImages= listOf(R.drawable.sademoji,R.drawable.truck,R.drawable.congrats)
        val adapter=NotificationAdapter(
           ArrayList(notification),
            ArrayList(notificationImages)
        )
              binding.notificationRecyclerView.layoutManager=LinearLayoutManager(requireContext())
        binding.notificationRecyclerView.adapter=adapter

   return binding.root
    }

    companion object {

    }
}