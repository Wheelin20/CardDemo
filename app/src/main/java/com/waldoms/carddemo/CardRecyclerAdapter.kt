package com.waldoms.carddemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.waldoms.carddemo.model.CardItem
import com.waldoms.carddemo.model.CardItems

class CardRecyclerAdapter : RecyclerView.Adapter<CardRecyclerAdapter.ViewHolder>()
{
    private val items:List<CardItem>

    init {
        val itemList:CardItems = CardItems()
        itemList.fetchItems()
        items = itemList.items
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardRecyclerAdapter.ViewHolder
    {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)

        return ViewHolder(v)
    }

    override fun getItemCount(): Int
    {
        return items.size
    }

    override fun onBindViewHolder(holder: CardRecyclerAdapter.ViewHolder, position: Int)
    {
        val item:CardItem = items[position]
        holder.itemTitle.text = item.itemTitle
        holder.itemDetail.text = item.itemDetails
        holder.itemImage.setImageResource(item.itemImage)
    }

    inner class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView)
    {
        var itemImage:ImageView
        var itemTitle:TextView
        var itemDetail:TextView

        init
        {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
        }
    }
}