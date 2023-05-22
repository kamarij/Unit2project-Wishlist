package com.example.project2_wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import layout.Wishlist
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var items: MutableList<Wishlist>
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val wish = findViewById<RecyclerView>(R.id.wishlist)

            val adpter = WishlistAdpter(items)

            wish.adapter = adpter
            wish.layoutManager = LinearLayoutManager(this)
    }
}