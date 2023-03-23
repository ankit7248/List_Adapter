package com.example.listadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = ProgrammingAdapter()

        recyclerView = findViewById(R.id.programmingList)
        val p1 = ProgrammingItem(1,"j","java")
        val p2 = ProgrammingItem(2,"h","Kotlin")
        val p3 = ProgrammingItem(3,"A","Android")

        adapter.submitList(listOf(p1,p2,p3))  // pass the data in adapter

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter

        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            val p3 = ProgrammingItem(1,"A","Android")
            val p4 = ProgrammingItem(2,"R","Golang")
            val p5 = ProgrammingItem(3,"G","Nodejs")
            val p6 = ProgrammingItem(3,"H","YES")

            adapter.submitList(listOf(p3,p4,p5))
        },4000)
    }
}