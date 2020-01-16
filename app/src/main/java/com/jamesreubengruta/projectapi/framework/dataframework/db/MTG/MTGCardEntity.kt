package com.jamesreubengruta.projectapi.framework.dataframework.db.MTG

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "MTGCards")
data class MTGCardEntity(
    @PrimaryKey(autoGenerate = true )val _id : Int,
    @ColumnInfo(name = "id") val id : String,
    @ColumnInfo(name = "name") val name : String,
    @ColumnInfo(name = "flavor") val flavor : String,
    @ColumnInfo(name = "life") val life : String,
    @ColumnInfo(name = "power") val power : String,
    @ColumnInfo(name = "manacost") val manascost : String,
    @ColumnInfo(name = "toughness") val toughness : String,
    @ColumnInfo(name = "text") val text : String,
    @ColumnInfo(name = "imageUrl") val imageUrl : String
    ){



}