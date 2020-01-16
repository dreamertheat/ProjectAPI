package com.jamesreubengruta.projectapi.framework.dataframework.db.MTG

import androidx.room.*
import com.jamesreubengruta.core.domain.models.MTG.MtgCard



@Dao
interface MTGCardDAO{

    @Query("select * from MTGCards ")
    suspend fun getCards() : List<MtgCard>
    @Insert
    suspend fun addCard(card : MtgCard)
    @Delete
    suspend fun deleteCard(id : String)
    @Query("select * from MTGCards where name like '%:name%'")
    suspend fun getCard(name : String) : MtgCard

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
