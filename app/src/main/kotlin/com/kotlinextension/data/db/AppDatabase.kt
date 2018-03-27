package com.kotlinextension.data.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.kotlinextension.data.db.dao.PetsDao
import com.kotlinextension.data.db.dao.UserAndAllPetsDao
import com.kotlinextension.data.db.dao.UsersDao
import com.kotlinextension.data.db.entity.Pet
import com.kotlinextension.data.db.entity.User

@Database(entities = [(User::class), (Pet::class)], version = 1)
abstract class AppDatabase : RoomDatabase() {

    /**
     * Returns [sersDao]
     * */
    abstract fun usersDao(): UsersDao

    /**
     * Returns [PetsDao]
     * */
    abstract fun petsDao(): PetsDao

    /**
     * Returns [UserAndPetsDao]
     * */
    abstract fun userAndPetsDao(): UserAndAllPetsDao

    companion object {

        @Volatile private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase =
                INSTANCE ?: synchronized(this, {
                    INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
                })


        private fun buildDatabase(context: Context) =
                Room.databaseBuilder(context.applicationContext,
                        AppDatabase::class.java, "AppDatabase.db")
                        .build()

    }
}
