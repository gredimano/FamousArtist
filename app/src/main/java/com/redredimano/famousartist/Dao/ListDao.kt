package com.redredimano.famousartist.Dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.redredimano.famousartist.Models.List as ListItem
import android.arch.persistence.room.OnConflictStrategy.REPLACE

@Dao
interface ListDao {
    @Query("SELECT * FROM lists")
    fun getAll(): List<ListItem>

    @Insert(onConflict = REPLACE)
    fun insertAll(vararg lists: ListItem)

}