package com.example.tugasmodule.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<RecyclerView>().apply {
    }
    var text: LiveData<RecyclerView> = _text
}