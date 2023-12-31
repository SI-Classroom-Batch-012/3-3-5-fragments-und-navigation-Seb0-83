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
import com.example.mywallet.data.Note
import com.example.mywallet.databinding.FragmentFirstBinding
import com.example.mywallet.databinding.FragmentSecondBinding
import com.example.mywallet.ui.adapter.ItemAdapter

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private lateinit var adapter: ItemAdapter
    private lateinit var mainActivity: MainActivity
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainActivity = activity as MainActivity
        val dataset = mainActivity.dataset
        adapter = ItemAdapter(dataset)
        binding.recyclerView.adapter = adapter

        binding.addButton.setOnClickListener {
        }



    }
}