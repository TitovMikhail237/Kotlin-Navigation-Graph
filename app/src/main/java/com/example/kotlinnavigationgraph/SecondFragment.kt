package com.example.kotlinnavigationgraph

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.kotlinnavigationgraph.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var bindingSecondFragment: FragmentSecondBinding

    private val args: SecondFragmentArgs by navArgs()

    private var data = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        bindingSecondFragment = FragmentSecondBinding.inflate(inflater, container, false)
        return bindingSecondFragment.root
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        data = args.dataInSecondFragment

        bindingSecondFragment.apply {
            tvDataInSecondFragment.text = data

            btnBackToBasicFragment.setOnClickListener {
                var direction = SecondFragmentDirections.actionSecondFragmentToBasicFragment()
                findNavController().navigate(direction)
            }
        }
    }
}
