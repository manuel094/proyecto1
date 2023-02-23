package com.example.appmvvm.data.network

import com.example.appmvvm.data.model.QuoteModel
import com.example.appmvvm.data.model.QuoteProvider

class QuoteRepository {
    private val api = QuoteService()
    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}