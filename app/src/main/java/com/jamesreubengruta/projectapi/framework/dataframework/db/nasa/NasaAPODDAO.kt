package com.jamesreubengruta.projectapi.framework.dataframework.db.nasa

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.IGNORE
import androidx.room.Query

@Dao
interface NasaAPODDAO {

    @Insert(onConflict = IGNORE)
    suspend fun addAPOD(apod: NasaAPODEntity)

    @Query("SELECT * FROM NasaAPOD WHERE date = :date")
    suspend fun getAPODbyDate(date: String): NasaAPODEntity

    @Query("SELECT * FROM NasaAPOD order by date desc limit 1")
    suspend fun getAPODLatest(): NasaAPODEntity

    @Query("SELECT * FROM NasaAPOD")
    suspend fun getAPODList(): List<NasaAPODEntity>

    @Delete
    suspend fun removeAPOD(apod: NasaAPODEntity)
}