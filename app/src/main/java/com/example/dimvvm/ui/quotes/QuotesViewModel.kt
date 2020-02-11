package com.example.dimvvm.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.dimvvm.data.model.Quote
import com.example.dimvvm.data.repo.QuoteRepoInterface


class QuotesViewModel(private val quoteRepoInterface: QuoteRepoInterface)
    : ViewModel() {

    fun addQuote(quote: Quote) = quoteRepoInterface.addQuote(quote)

    fun getQuotes() = quoteRepoInterface.getQuotes()
}