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
import com.example.mywallet.databinding.FragmentThirdBinding
import com.example.mywallet.ui.adapter.ItemAdapter

class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding
    private lateinit var adapter: ItemAdapter
    private lateinit var mainActivity: MainActivity
    val args: ThirdFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainActivity = activity as MainActivity
        val position = args.itemList
        val item = mainActivity.dataset[position]

        binding.editTitle.setText(item.titleText)
        binding.editText.setText(item.textText)

        binding.saveButton.setOnClickListener {
            val navcontroller = binding.saveButton.findNavController()
            navcontroller.navigate(ThirdFragmentDirections.actionThirdFragmentToSecondFragment2(position))

        }
    }
}