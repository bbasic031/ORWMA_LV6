package hr.ferit.brunobasic.lv6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup


class RadioFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_radio, container, false)
        val forwardButton=rootView.findViewById<Button>(R.id.forwardButton)

        forwardButton.setOnClickListener{
            val fragment=DisplayFragment()
            val radioGroup=rootView.findViewById<RadioGroup>(R.id.radioGroup)
            val radioButton=rootView.findViewById<RadioButton>(radioGroup.checkedRadioButtonId)
            val bundle=Bundle()
            bundle.putString("BUTTON",radioButton.text.toString())
            fragment.arguments=bundle
            val transaction=fragmentManager?.beginTransaction()
            transaction?.replace(R.id.layout,fragment)?.commit()
        }
        return rootView;
    }
}