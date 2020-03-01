package com.example.a2ndplace

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class answerFragment : Fragment() {
    private var listener: OnFragmentInteractionListener? = null

    val myAnswers = listOf<Answer>(
            Answer(R.drawable.nemesis,"NEMESIS", "NEMESIS is your closest cat companion!"),
            Answer(R.drawable.phill, "Tim", "....there are some who call you...Tim..?"),
            Answer(R.drawable.venus, "Ssasssy Cat", "You've been matched with a Sasssy Cat"),
            Answer(R.drawable.persian, "Lost", "You seem to be lost."),
            Answer(R.drawable.youbeadorable, "Kitten !", "You Be Adorable"),
            Answer(R.drawable.hairless, "AAAhhh!!", "The hairless is your closest cat companion!")

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

    fun onButtonPressed(uri: Uri) {
        listener?.onFragmentInteraction(uri)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    interface OnFragmentInteractionListener {
        fun onFragmentInteraction(uri: Uri)
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
