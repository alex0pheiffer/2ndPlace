package com.example.a2ndplace

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class answerFragment : Fragment() {

    val myAnswers = listOf<Answer>(
            Answer(R.drawable.nemesis,"NEMESIS", "NEMESIS is your closest cat companion!"),
            Answer(R.drawable.phill, "Tim", "....there are some who call you...Tim..?"),
            Answer(R.drawable.venus, "Ssasssy Cat", "You've been matched with a Sasssy Cat"),
            Answer(R.drawable.persian, "Lost", "You seem to be lost."),
            Answer(R.drawable.youbeadorable, "Kitten !", "You Be Adorable"),
            Answer(R.drawable.hairless, "AAAhhh!!", "The hairless is your closest cat companion!"),
            Answer(R.drawable.banana,"Sleeping in Fruit","You find satisfactory comfort amongst food."),
            Answer(R.drawable.bonk,"bonk !","TODO"),
            Answer(R.drawable.catbed,"","TODO"),
            Answer(R.drawable.cheeto,"Cheeto","TODO"),
            Answer(R.drawable.christmascat,"MERRY CHRISTMAS", "You light up around the holiday season!"),
            Answer(R.drawable.cupcat,"","TODO"),
            Answer(R.drawable.fastcat,"","TODO"),
            Answer(R.drawable.triggercat,"mrew","TODO"),
            Answer(R.drawable.thedailystruggle,"","TODO"),
            Answer(R.drawable.stuck,"","TODO"),
            Answer(R.drawable.sleepntabby,"","TODO"),
            Answer(R.drawable.santa,"","TODO"),
            Answer(R.drawable.scrabble,"","TODO"),
            Answer(R.drawable.kittenwtoy,"","TODO"),
            Answer(R.drawable.lion,"","TODO"),
            Answer(R.drawable.kitteen,"","TODO")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_answer, container, false)
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                answerFragment().apply {
                    arguments = Bundle().apply {
                    }
                }
    }
}
