package com.example.appmvvm.domain

import com.example.appmvvm.data.network.QuoteRepository
import com.example.appmvvm.data.model.QuoteModel

class GetQuotesUseCase {
    private val repository = QuoteRepository()
    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()

}