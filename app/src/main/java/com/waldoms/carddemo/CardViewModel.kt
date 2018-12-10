package com.waldoms.carddemo

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.waldoms.carddemo.model.CardItem
import com.waldoms.carddemo.model.CardItems

@BindingAdapter("setCardAdapter")
fun bindCardRecyclerAdapter(recyclerView: RecyclerView, adapter: CardRecyclerAdapter)
{
    recyclerView.layoutManager = LinearLayoutManager(recyclerView.context)
    recyclerView.adapter = adapter
}

@BindingAdapter("setItemImage")
fun bindItemImage(imageView: ImageView, imageId:Int)
{
    imageView.setImageResource(imageId)
}

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