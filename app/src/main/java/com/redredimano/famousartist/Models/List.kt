package com.redredimano.famousartist.Models

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "lists")
data class List(@field:ColumnInfo(name = "firstName") val firstName: String,
           @field:ColumnInfo(name = "lastName") val lastName: String,
           @field:ColumnInfo(name = "email") val email: String) {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
