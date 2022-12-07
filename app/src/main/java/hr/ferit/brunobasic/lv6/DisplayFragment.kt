package hr.ferit.brunobasic.lv6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class DisplayFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_display, container, false)
        val backwardButton=rootView.findViewById<Button>(R.id.backwardButton)
        val textView=rootView.findViewById<TextView>(R.id.outputText)
        textView.text = arguments?.getString("BUTTON").toString()

        backwardButton.setOnClickListener{
            val fragment=RadioFragment()
            val transaction=fragmentManager?.beginTransaction()
            transaction?.replace(R.id.layout,fragment)?.commit()
        }
        return rootView
    }
}