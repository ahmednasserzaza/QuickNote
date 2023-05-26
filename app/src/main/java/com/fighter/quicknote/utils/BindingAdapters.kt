package com.fighter.quicknote.utils

import android.util.Log
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.fighter.quicknote.ui.base.BaseAdapter

@BindingAdapter(value = ["app:items"])
fun<T> setRecyclerItems(view: RecyclerView, items:List<T>?){
    if (items != null){
        (view.adapter as BaseAdapter<T>?)?.setItems(items)
        Log.e("my Items" , "$items")
    }
    else{
        (view.adapter as BaseAdapter<T>?)?.setItems(emptyList())
    }
}