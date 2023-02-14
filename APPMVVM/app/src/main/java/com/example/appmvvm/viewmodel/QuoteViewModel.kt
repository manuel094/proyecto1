package com.example.appmvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appmvvm.model.QuoteModel
import com.example.appmvvm.model.QuoteProvider

class QuoteViewModel: ViewModel(){
    val quoteModel = MutableLiveData<QuoteModel>()
    fun randomQuote() {
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}