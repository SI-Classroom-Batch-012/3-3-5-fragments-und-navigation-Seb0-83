package com.example.mywallet.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.mywallet.MainActivity
import com.example.mywallet.R
import com.example.mywallet.databinding.FragmentSecondBinding
import com.example.mywallet.ui.adapter.ItemAdapter

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private lateinit var adapter: ItemAdapter
    private lateinit var mainActivity: MainActivity
    val args: SecondFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainActivity = activity as MainActivity
        val position = args.itemList
        val item = mainActivity.dataset[position]

        binding.secTitleTV.setText(item.titleText)
        binding.secTextTV.setText(item.textText)

        binding.secTitleTV.setOnClickListener{
            val navcontroller = binding.secTitleTV.findNavController()
            navcontroller.navigate(SecondFragmentDirections.actionSecondFragmentToThirdFragment2(position))
        }
    }

}