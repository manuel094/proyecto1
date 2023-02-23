package com.example.appmvvm.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import com.example.appmvvm.databinding.ActivityMainBinding
import com.example.appmvvm.domain.GetQuotesUseCase
import com.example.appmvvm.ui.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val quoteViewModel: QuoteViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        quoteViewModel.onCreate()
        quoteViewModel.quoteModel.observe(this, Observer {
            binding.tvQuote.text = it.quote
            binding.tvAuthor.text = it.author
        })
        quoteViewModel.isLoading.observe(this, Observer {
            binding.loading!!.isVisible = it
        })
        binding.viewContainer.setOnClickListener { quoteViewModel.randomQuote() }
    }
}