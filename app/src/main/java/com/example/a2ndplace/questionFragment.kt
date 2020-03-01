package com.example.a2ndplace

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_question.*

class questionFragment : Fragment () {

    var questionIndex = 0
    var numButton1 = 0
    var numButton4 = 0

    val questions = listOf<String>(
            "What year are you?",
            "Is your name Tim?",
            "Where do you live?",
            "How many siblings do you have?",
            "Choose one that sounds the most fun",
            "Where are you from?",
            ""

    )

    val answers = listOf<List<String>>(
            listOf<String>(
                    "freshman",  "sophomore", "junior", "senior"),
            listOf<String>(
                    "yes","no","I wish","No, thank god"),
            listOf<String>(
                    "on the hill", "university apartments", "off campus apartments", "home"),
            listOf<String>(
                    "hiking", "reading", "partying"),
            listOf<String>(
                    "socal", "norcal", "out-of state", "international"),
            listOf<String>(
                    ""
            )


            )
    )

    lateinit var questionText: TextView
    lateinit var Button1:Button
    lateinit var Button2:Button
    lateinit var Button3:Button
    lateinit var Button4:Button

override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
): View? {
    // Inflate the layout for this fragment
    val renderedView = inflater.inflate(R.layout.fragment_question, container, false)

    questionText = question

    questionText.text = questions[0]

    Button1 = button1
    Button2 = button2
    Button3 = button3
    Button4 = button4

    Button1.text= answers[0][0]
    Button2.text= answers[0][1]
    Button3.text= answers[0][2]
    Button4.text= answers[0][3]

    Button1.setOnClickListener {
        numButton1++
        goToNextQuestion()
    }

    Button2.setOnClickListener {
        goToNextQuestion()
    }

    Button3.setOnClickListener {
        goToNextQuestion()
    }


    Button4.setOnClickListener {
        numButton4++
        goToNextQuestion()

    }

    return renderedView
}
// navigation make
fun goToNextQuestion(){
    questionIndex++

    if (questionIndex == questions.size) {
        //todo: go to answer fragment
        findNavController().navigate(
                questionFragment.
                        actionquestionFragmentToAnswerFragment(
                        questions.size,
                        numYes
                )
        )
        return
    }

    questionText.text= questions[questionIndex]
    Button1.text = answers[questionIndex][0]
    Button2.text = answers[questionIndex][1]
    Button3.text = answers[questionIndex][2]
    Button4.text = answers[questionIndex][3]


    }

}

