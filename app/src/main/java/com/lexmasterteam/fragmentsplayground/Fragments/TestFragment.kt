package com.lexmasterteam.fragmentsplayground.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.lexmasterteam.fragmentsplayground.databinding.FragmentTestBinding


class testFragment : Fragment() {
    private lateinit var binding: FragmentTestBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTestBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.xdTV.text="XDD"


        binding.button.setOnClickListener {
            view:View->
            val action1 = testFragmentDirections
                .actionTestFragmentToTest2Fragment()
            view.findNavController().navigate(action1)
        }
    }


}