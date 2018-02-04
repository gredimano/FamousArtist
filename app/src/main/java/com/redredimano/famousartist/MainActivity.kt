package com.redredimano.famousartist

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.redredimano.famousartist.Adapters.ListAdapter
import com.redredimano.famousartist.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    lateinit var listAdapter: ListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        listAdapter = ListAdapter(this, DataService.lists)
        recycler_view.adapter = listAdapter
        val layoutManager = LinearLayoutManager(this)
        recycler_view.layoutManager = layoutManager
        recycler_view.setHasFixedSize(true)
    }

    fun addItemClicked(view: View) {
        val intent = Intent(this, CreateListFormActivity::class.java)
        startActivity(intent)
    }
}
