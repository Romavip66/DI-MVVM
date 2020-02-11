package com.example.dimvvm.data.repo

import androidx.lifecycle.LiveData
import com.example.dimvvm.data.model.Quote

interface QuoteRepoInterface {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}