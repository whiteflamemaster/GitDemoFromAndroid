package com.example.gitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var myViewModel:MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myViewModel=ViewModelProvider(this).get(MyViewModel::class.java)
        myViewModel.numberLivadata.observe(this, Observer {
            textView.text="${it}"
        })
        buttonAdd.setOnClickListener { myViewModel.add(1) }
        buttonSub.setOnClickListener { myViewModel.add(-1) }
        //to be or not to be ,
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==R.id.Mreset){
        myViewModel.reset()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
}