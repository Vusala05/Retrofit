package com.example.retrofit

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit.databinding.RowLayoutBinding

class RecyclerViewAdapter(private val cryptoList: ArrayList<CryptoModel>) : RecyclerView.Adapter<RecyclerViewAdapter.RowHolder>() {

    class RowHolder(val binding: RowLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {
        val binding = RowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RowHolder(binding)
    }

    override fun getItemCount(): Int {
        return cryptoList.size
    }

    override fun onBindViewHolder(holder: RowHolder, @SuppressLint("RecyclerView") position: Int) {
        holder.binding.textName.text = cryptoList[position].currency
        holder.binding.textPrice.text = cryptoList[position].price
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateData(newCryptoList: List<CryptoModel>) {
        cryptoList.clear()
        cryptoList.addAll(newCryptoList)
        notifyDataSetChanged()
    }
}
