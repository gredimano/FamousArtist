package com.redredimano.famousartist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_create_list_form.*

class CreateListFormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_list_form)
    }

    fun submitButtonClicked(view: View) {
        Log.i("CreateUser", "firstName: ${et_firstName.text}")
        Log.i("CreateUser", "lastName: ${et_lastName.text}")
        Log.i("CreateUser", "email: ${et_email.text}")
    }
}
