package com.waldoms.carddemo

import androidx.lifecycle.ViewModel
import com.waldoms.carddemo.model.CardItem
import com.waldoms.carddemo.model.CardItems

class CardViewModel : ViewModel()
{
    val adapter: CardRecyclerAdapter

    val items:List<CardItem>

    init
    {
        val itemList: CardItems = CardItems()
        itemList.fetchItems()
        items = itemList.items
        adapter = CardRecyclerAdapter(this)
    }
}