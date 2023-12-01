package com.example.mywallet.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.mywallet.data.Note
import com.example.mywallet.databinding.ListItemBinding
import com.example.mywallet.ui.fragments.FirstFragmentDirections

class ItemAdapter(
    val dataset: List<Note>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    inner class ItemViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.ItemViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemAdapter.ItemViewHolder, position: Int) {
        val item = dataset[position]

        holder.binding.noteTitleTV.setText(item.titleText)
        holder.binding.noteTextTV.setText(item.textText)

        holder.binding.noteCV.setOnClickListener {
            val navController = holder.itemView.findNavController()
            navController.navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(position))
        }
        holder.binding.navBarCloseButton.setOnClickListener {

            //remove
        }
        holder.binding.navBarEditButton.setOnClickListener {
            //Edit page
            val navController = holder.itemView.findNavController()
            navController.navigate(FirstFragmentDirections.actionFirstFragmentToThirdFragment())
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}