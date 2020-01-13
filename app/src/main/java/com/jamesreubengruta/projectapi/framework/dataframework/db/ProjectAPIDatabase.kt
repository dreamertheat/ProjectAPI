package com.jamesreubengruta.projectapi.framework.dataframework.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.jamesreubengruta.projectapi.framework.dataframework.db.NASA.NasaAPODDAO
import com.jamesreubengruta.projectapi.framework.dataframework.db.NASA.NasaAPODEntity


@Database(
    entities = [NasaAPODEntity::class],
    version = 1,
    exportSchema = false
)

abstract class ProjectAPIDatabase : RoomDatabase() {

    companion object {

        private const val DATABASE_NAME = "projectAPI.db"

        private var instance: ProjectAPIDatabase? = null

        private fun create(context: Context): ProjectAPIDatabase =
            Room.databaseBuilder(context, ProjectAPIDatabase::class.java, DATABASE_NAME)
                .fallbackToDestructiveMigration()
                .build()


        fun getInstance(context: Context): ProjectAPIDatabase =
            (instance ?: create(context)).also { instance = it }
    }

    abstract fun nasaAPODDAO(): NasaAPODDAO


}