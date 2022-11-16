package com.example.viewmodel.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.R
import com.example.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // create viewModelProvider
        mainViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.count.text = mainViewModel.count.toString()

        binding.btnCount.setOnClickListener {
            binding.count.text = mainViewModel.getUpdateCount().toString()
        }

    }
}