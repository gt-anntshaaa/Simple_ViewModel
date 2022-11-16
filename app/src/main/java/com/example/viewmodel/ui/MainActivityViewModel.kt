package com.example.viewmodel.ui

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel(){
    var count = 0

    get() {
        return field
    }

    fun getUpdateCount(): Int = ++count
}