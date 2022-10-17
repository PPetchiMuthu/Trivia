package com.example.android.trivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class Question3 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_question3,container,false)
        val startButton = view.findViewById<Button>(R.id.next)
        startButton.setOnClickListener{
            view.findNavController().navigate(R.id.action_question3_to_question4)
        }
        return view    }

}