package com.waldoms.carddemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

class CardRecyclerAdapter(val mViewModel: CardViewModel) : RecyclerView.Adapter<CardRecyclerAdapter.ViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardRecyclerAdapter.ViewHolder
    {
        val layoutInflater = LayoutInflater.from(parent.context)

        val binding: ViewDataBinding = DataBindingUtil.inflate(layoutInflater, R.layout.card_layout, parent, false)

        return ViewHolder(binding)
    }

    override fun getItemCount(): Int
    {
        return mViewModel.items.size
    }

    override fun onBindViewHolder(holder: CardRecyclerAdapter.ViewHolder, position: Int)
    {
        holder.bind(mViewModel, position)
    }

    inner class ViewHolder(binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root)
    {
        val binding: ViewDataBinding

        init
        {
            this.binding = binding
        }

        fun bind(viewModel: CardViewModel, position: Int)
        {
            binding.setVariable(BR.viewModel, viewModel)
            binding.setVariable(BR.position, position)
        }
    }
}