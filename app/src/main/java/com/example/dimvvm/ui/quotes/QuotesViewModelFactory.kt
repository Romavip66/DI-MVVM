package com.example.dimvvm.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dimvvm.data.repo.QuoteRepoInterface

class QuotesViewModelFactory(private val quoteRepoInterface: QuoteRepoInterface) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuotesViewModel(quoteRepoInterface) as T
    }

}