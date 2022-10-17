package com.example.android.trivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class Question1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_question1,container,false)
        val startButton = view.findViewById<Button>(R.id.next)
        startButton.setOnClickListener{
            view.findNavController().navigate(R.id.action_question1Fragment_to_question2)
        }
        return view
    }
}