package com.jamesreubengruta.projectapi.framework.dataframework.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.jamesreubengruta.projectapi.framework.dataframework.db.mtg.MTGCardDAO
import com.jamesreubengruta.projectapi.framework.dataframework.db.mtg.MTGCardEntity
import com.jamesreubengruta.projectapi.framework.dataframework.db.nasa.NasaAPODDAO
import com.jamesreubengruta.projectapi.framework.dataframework.db.nasa.NasaAPODEntity


@Database(
    entities = [NasaAPODEntity::class, MTGCardEntity::class],
    version = 1,
    exportSchema = false
)abstract class ProjectAPIDatabase : RoomDatabase() {

    companion object {

        private const val DATABASE_NAME = "projectAPI.db"

        private var instance: ProjectAPIDatabase? = null

        private fun create(context: Context): ProjectAPIDatabase =
            Room.databaseBuilder(context.applicationContext, ProjectAPIDatabase::class.java, DATABASE_NAME)
                .allowMainThreadQueries()
                .build()


        fun getInstance(context: Context): ProjectAPIDatabase =
            (instance ?: create(context)).also {
                instance = it
            }



        //

    }

    abstract fun nasaAPODDAO(): NasaAPODDAO
    abstract fun mtgDAO(): MTGCardDAO

}