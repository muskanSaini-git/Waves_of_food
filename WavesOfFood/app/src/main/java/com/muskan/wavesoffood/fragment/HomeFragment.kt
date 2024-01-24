package com.muskan.wavesoffood.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.muskan.wavesoffood.MenuBottomSheetFragment
import com.muskan.wavesoffood.R
import com.muskan.wavesoffood.adapters.PopularAdapter
import com.muskan.wavesoffood.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

       binding=FragmentHomeBinding.inflate(inflater, container, false)
        binding.viewAllMenu.setOnClickListener {
           val bottomSheetDialog= MenuBottomSheetFragment()
           bottomSheetDialog.show(parentFragmentManager,"Test")
        }
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageList=ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.banner1,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner2,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner3,ScaleTypes.FIT))
        val imageView=binding.imageView
        imageView.setImageList(imageList)
        imageView.setImageList(imageList,ScaleTypes.FIT)
        imageView.setItemClickListener(object :ItemClickListener{
            override fun doubleClick(position: Int) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(position: Int) {
             val itemPosition=imageList[position]
                val itemMessage="Selected Image $position"
                Toast.makeText(requireContext(), itemMessage, Toast.LENGTH_SHORT).show()
            }
        })
        val FoodName= listOf("Burger","Sandwich","Ice Cream", "Mamo", "Spacy fresh crab", "Spacy fresh crab", "Spacy fresh crab", "Ice Cream","Rabadi")
        val Price= listOf("$5","$7","$8","$9","$6","$6","$6","$6","$88")
        val popularFoodImage= listOf(
            R.drawable.menu1,
            R.drawable.menu2,
            R.drawable.menu3,
            R.drawable.menu4,
            R.drawable.menu5,
            R.drawable.menu6,
            R.drawable.menu5,
            R.drawable.menu3,
            R.drawable.menu2
        )
        val adapter= PopularAdapter(ArrayList(FoodName),ArrayList(Price),ArrayList(popularFoodImage),requireActivity())
        binding.popularRecyclarview.layoutManager= LinearLayoutManager(requireContext())
        binding.popularRecyclarview.adapter=adapter
    }

    companion object {

    }
}