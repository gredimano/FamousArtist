package com.redredimano.famousartist.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.redredimano.famousartist.Models.List
import com.redredimano.famousartist.R

class ListAdapter(val context: Context, val lists: ArrayList<List>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bindMessage(context, lists[position])
    }

    override fun getItemCount(): Int {
        return lists.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_views, parent, false)
        return ViewHolder(view)
    }

    inner class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val firstName = itemView?.findViewById<TextView>(R.id.listFirstName)
        val lastName = itemView?.findViewById<TextView>(R.id.listLastName)
        val email = itemView?.findViewById<TextView>(R.id.listEmail)

        fun bindMessage(context: Context, list: List) {
            firstName?.text = list.firstName
            lastName?.text = list.lastName
            email?.text = list.email
        }
    }
}