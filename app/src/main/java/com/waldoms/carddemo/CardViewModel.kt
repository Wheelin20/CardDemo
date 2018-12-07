package com.waldoms.carddemo

import androidx.lifecycle.ViewModel

class CardViewModel : ViewModel()
{
    val adapter: CardRecyclerAdapter

    init
    {
        adapter = CardRecyclerAdapter()
    }
}