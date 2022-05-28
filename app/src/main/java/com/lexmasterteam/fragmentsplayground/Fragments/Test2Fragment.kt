package com.lexmasterteam.fragmentsplayground.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.lexmasterteam.fragmentsplayground.R
import com.lexmasterteam.fragmentsplayground.databinding.FragmentTest2Binding


class Test2Fragment : Fragment() {
    private lateinit var binding: FragmentTest2Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTest2Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button2.setOnClickListener {
                view:View->
            val action2 = Test2FragmentDirections
                .actionTest2FragmentToTestFragment()
            view.findNavController().navigate(action2)
        }
    }


}