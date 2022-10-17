package com.example.android.trivia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController


class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home,container,false)
        val startButton = view.findViewById<Button>(R.id.Start)
        startButton.setOnClickListener{
              view.findNavController().navigate(R.id.action_homeFragment_to_question1Fragment)
        }
     return view
    }

//        val binding: FragmentTitleBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
//        binding.playButton.setOnClickListener { view: View ->
//         view.findNavController().navigate(R.id.action_homeFragment_to_question1Fragment)
//    }
//        return binding.root
//    }

}