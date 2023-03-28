package com.example.kotlinnavigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.kotlinnavigationgraph.databinding.FragmentBasicBinding

class BasicFragment : Fragment() {

    private lateinit var bindingBasicFragment: FragmentBasicBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        bindingBasicFragment = FragmentBasicBinding.inflate(inflater, container, false)
        return bindingBasicFragment.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindingBasicFragment.apply {

            btnForFirstFragment.setOnClickListener {
                val directionFirst = BasicFragmentDirections.actionBasicFragmentToFirstFragment()
                findNavController().navigate(directionFirst)
            }

            btnForSecondFragment.setOnClickListener {
                val directionSecond = BasicFragmentDirections.actionBasicFragmentToSecondFragment(
                    etDataToSecondFragment.text.toString()
                )
                findNavController().navigate(directionSecond)
            }
        }
    }
}

