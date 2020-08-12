package com.example.gitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var myViewModel:MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myViewModel=ViewModelProvider(this).get(MyViewModel::class.java)
        setContentView(R.layout.activity_main)
        textView.text="${myViewModel.number}"
        buttonAdd.setOnClickListener { textView.text="${++(myViewModel.number)}" }
        buttonSub.setOnClickListener { textView.text="${--(myViewModel.number)}" }
    }
}