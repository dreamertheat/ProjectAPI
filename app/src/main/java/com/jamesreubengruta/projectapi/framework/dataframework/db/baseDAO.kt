package com.jamesreubengruta.projectapi.framework.dataframework.db

import androidx.room.*
import com.jamesreubengruta.core.domain.models.MTG.MtgCard
import com.jamesreubengruta.projectapi.framework.dataframework.db.mtg.MTGCardEntity


@Dao
open interface BaseDAO<T>{


    @Insert(onConflict = OnConflictStrategy.REPLACE)
      suspend fun add(vararg name : T)

    @Delete
      suspend fun delete(vararg name : T)

    @Update
      suspend fun update(vararg name : T)

}
























/*

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
    suspend fun removeAPOD(_id: Int)
}*/
