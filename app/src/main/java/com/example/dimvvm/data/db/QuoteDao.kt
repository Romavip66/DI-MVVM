package com.example.dimvvm.data.db

import androidx.lifecycle.LiveData
import com.example.dimvvm.data.model.Quote

interface QuoteDao {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>


}