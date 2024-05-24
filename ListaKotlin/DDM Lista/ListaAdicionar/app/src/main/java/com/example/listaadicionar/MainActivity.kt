package com.example.listaadicionar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var productListView: ListView
    private val productList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        productListView = findViewById(R.id.productListView)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, productList)
        productListView.adapter = adapter

        findViewById<Button>(R.id.buttonAddProduct).setOnClickListener {
            addProduct()
            adapter.notifyDataSetChanged()
        }
    }

    private fun addProduct() {
        productList.add("Novo produto")
    }
}