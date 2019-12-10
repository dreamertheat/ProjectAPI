package com.jamesreubengruta.core.data.datasource

import com.jamesreubengruta.core.domain.models.NASA.NasaAPODModel
import com.jamesreubengruta.core.domain.models.NASA.NasaMediaModel

interface NasaMediaDataSource {

    suspend fun add(data: NasaMediaModel)
    suspend fun getLatest (date : String):NasaMediaModel
    suspend fun getList():List<NasaMediaModel>
    suspend fun remove(data: NasaMediaModel)

}