package com.waldoms.carddemo

import androidx.databinding.BindingAdapter
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView

class CardViewModel : ViewModel()
{
    val adapter: CardRecyclerAdapter

    init
    {
        adapter = CardRecyclerAdapter()
    }
}