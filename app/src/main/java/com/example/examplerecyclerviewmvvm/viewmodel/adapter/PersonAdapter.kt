package com.example.examplerecyclerviewmvvm.viewmodel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.examplerecyclerviewmvvm.databinding.LayoutItemBinding
import com.example.examplerecyclerviewmvvm.viewmodel.listOfPeople

class PersonAdapter(private val listOfPeople: listOfPeople) : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = LayoutItemBinding.inflate(inflater, parent, false)

        return PersonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val person = listOfPeople[position]

        holder.binding.apply {
            TVName.text = "${person.name} ${person.surname}"
        }
    }

    override fun getItemCount(): Int = listOfPeople.size

    inner class PersonViewHolder(val binding: LayoutItemBinding) : RecyclerView.ViewHolder(binding.root)
}