package com.example.gitdemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel:ViewModel() {
    private val _number =MutableLiveData(0)
    val numberLivadata:LiveData<Int> get()=_number
    fun add(i:Int ){
        _number.value=_number.value?.plus(i)
    }
    fun reset(){
        _number.value=0
    }
    var number=0
}