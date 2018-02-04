package com.redredimano.famousartist

import android.arch.persistence.room.Room
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.redredimano.famousartist.Models.List
import kotlinx.android.synthetic.main.activity_create_list_form.*

class CreateListFormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_list_form)
    }

    fun submitButtonClicked(view: View) {
        val db = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "production")
                .allowMainThreadQueries()
                .build()

        val firstName = et_firstName.text.toString()
        val lastName = et_lastName.text.toString()
        val email = et_email.text.toString()

        val list = List(firstName, lastName, email)
        db.listsDao().insertAll(list)


        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
