package com.waldoms.carddemo

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter("setCardAdapter")
fun bindCardRecyclerAdapter(recyclerView: RecyclerView, adapter: CardRecyclerAdapter)
{
    recyclerView.layoutManager = LinearLayoutManager(recyclerView.context)
    recyclerView.adapter = adapter
}

