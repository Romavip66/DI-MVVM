package com.example.dimvvm

import android.app.Application
import com.example.dimvvm.data.db.Database
import com.example.dimvvm.data.db.DatabaseFakeImpl
import com.example.dimvvm.data.db.QuoteDao
import com.example.dimvvm.data.db.QuoteDaoFakeImp
import com.example.dimvvm.data.repo.QuoteRepoImpl
import com.example.dimvvm.data.repo.QuoteRepoInterface
import com.example.dimvvm.ui.quotes.QuotesViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class QuotesApplication : Application(), KodeinAware {
    override val kodein = Kodein.lazy {
        bind<Database>() with singleton { DatabaseFakeImpl() }
        bind<QuoteDao>() with  singleton { instance<Database>().quoteDao }
        bind<QuoteRepoInterface>() with  singleton { QuoteRepoImpl(instance()) }
        bind() from  provider { QuotesViewModelFactory(instance()) }

    }
}