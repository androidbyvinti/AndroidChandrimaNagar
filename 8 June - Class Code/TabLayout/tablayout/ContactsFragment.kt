package com.bmpl.tablayout

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_contacts.*


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ContactsFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ContactsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ContactsFragment : Fragment() {

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        textView.text = "This is Contacts Fragment"
//
//    }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_contacts, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView.text = "This is Contacts Fragment"
    }

}// Required empty public constructor
