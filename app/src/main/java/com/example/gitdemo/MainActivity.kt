package com.example.gitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import android.view.Menu
import android.view.MenuItem
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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==R.id.Mreset){
myViewModel.number=0
            textView.text="${myViewModel.number}"
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
}