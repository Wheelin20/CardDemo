package com.waldoms.carddemo.model

import androidx.lifecycle.MutableLiveData
import com.waldoms.carddemo.R

class CardItems
{
    val items:MutableList<CardItem> = ArrayList<CardItem>()

    private val titles:Array<String> = arrayOf("Chapter One", "Chapter Two", "Chapter Three", "Chapter Four",
        "Chapter Five", "Chapter Six", "Chapter Seven", "Chapter Eight")

    private val details:Array<String> = arrayOf("Item One Details", "Item Two Details", "Item Three Details", "Item Four Details",
        "Item Five Details", "Item Six Details", "Item Seven Details", "Item Eight Details")

    private val images:Array<Int> = arrayOf(R.drawable.android_image_1, R.drawable.android_image_2, R.drawable.android_image_3,
        R.drawable.android_image_3, R.drawable.android_image_4, R.drawable.android_image_5, R.drawable.android_image_6,
        R.drawable.android_image_7, R.drawable.android_image_8)

    fun fetchItems()
    {
        for(i:Int in 0..7)
        {
            items.add(CardItem(images[i], titles[i], details[i]))
        }
    }
}