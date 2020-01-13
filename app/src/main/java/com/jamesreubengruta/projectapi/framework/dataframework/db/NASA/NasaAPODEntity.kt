package com.jamesreubengruta.projectapi.framework.dataframework.db.NASA

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "NasaAPOD")
data class NasaAPODEntity(
    @PrimaryKey(autoGenerate = true) val _id: Int = 0,
    @ColumnInfo(name = "copyright") val copyright: String,
    @ColumnInfo(name = "date") val date: String,
    @ColumnInfo(name = "explanation") val explanation: String,
    @ColumnInfo(name = "media_type") val media_type: String,
    @ColumnInfo(name = "service_version") val service_version: String,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "url") val url: String,
    @ColumnInfo(name = "hd_url") val hd_url: String
    )