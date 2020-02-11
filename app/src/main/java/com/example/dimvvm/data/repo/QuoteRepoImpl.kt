package com.example.dimvvm.data.repo

import com.example.dimvvm.data.db.QuoteDao
import com.example.dimvvm.data.model.Quote

class QuoteRepoImpl(private val quoteDao: QuoteDao) : QuoteRepoInterface {
    override fun addQuote(quote: Quote){
        quoteDao.addQuote(quote)
    }

    override fun getQuotes()= quoteDao.getQuotes()
}