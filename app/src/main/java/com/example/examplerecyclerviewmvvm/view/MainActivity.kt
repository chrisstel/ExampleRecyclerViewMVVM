package com.example.examplerecyclerviewmvvm.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.examplerecyclerviewmvvm.databinding.ActivityMainBinding
import com.example.examplerecyclerviewmvvm.viewmodel.PersonViewModel
import com.example.examplerecyclerviewmvvm.viewmodel.adapter.PersonAdapter

class MainActivity : AppCompatActivity() {
    private val personViewModel = PersonViewModel()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initViews()
        initObservers()
        personViewModel.getPeople()
    }

    private fun initViews() {
        binding.RV.layoutManager = LinearLayoutManager(this)
    }

    private fun initObservers() {
        personViewModel.liveData.observe(this@MainActivity) {
                binding.RV.adapter = PersonAdapter(it)
        }
    }
}