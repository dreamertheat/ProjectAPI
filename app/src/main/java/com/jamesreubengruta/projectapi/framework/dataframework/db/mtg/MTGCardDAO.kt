package com.jamesreubengruta.projectapi.framework.dataframework.db.mtg

import androidx.room.*
import com.jamesreubengruta.core.domain.models.MTG.MtgCard


@Dao
abstract class MTGCardDAO {

    @Query("SELECT * FROM MTGCards where name like :name")
    abstract suspend fun getList(name: String?): List<MtgCard>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun add(uid : MTGCardEntity )

    @Delete
    abstract suspend fun delete(uid : MTGCardEntity)

    @Update
    abstract suspend fun update(uid : MTGCardEntity )


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
