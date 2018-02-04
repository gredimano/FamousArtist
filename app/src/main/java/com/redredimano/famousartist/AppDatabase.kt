package com.redredimano.famousartist

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.redredimano.famousartist.Dao.ListDao
import com.redredimano.famousartist.Models.List as ListItem

@Database(entities = [ListItem::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun listsDao(): ListDao

    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context, inMemory: Boolean = true): AppDatabase? {
            if (INSTANCE == null) {
                synchronized(AppDatabase::class) {
                    INSTANCE = if (inMemory) {
                        Room.inMemoryDatabaseBuilder(context.applicationContext, AppDatabase::class.java).build()
                    } else {
                        Room.databaseBuilder(context.applicationContext,
                                AppDatabase::class.java, "paFamous-app.db")
                                .build()
                    }
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}
