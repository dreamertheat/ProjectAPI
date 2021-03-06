package com.jamesreubengruta.core.data.datasource.nasa

import com.jamesreubengruta.core.domain.models.NASA.NasaAPODModel

interface NasaAPODDataSource {

    suspend fun add(data: NasaAPODModel)
    suspend fun getLatest (date : String):NasaAPODModel
    suspend fun getList():List<NasaAPODModel>
    suspend fun remove(mod: NasaAPODModel)

}