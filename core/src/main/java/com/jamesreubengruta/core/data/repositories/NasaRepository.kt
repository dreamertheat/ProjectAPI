package com.jamesreubengruta.core.data.repositories

import com.jamesreubengruta.core.data.datasource.NasaAPODDataSource
import com.jamesreubengruta.core.domain.models.NASA.NasaAPODModel

class NasaRepository(private val dataSource : NasaAPODDataSource){

        suspend fun addData(data: NasaAPODModel)=dataSource.add(data)
        suspend fun getLatest(date:String)=dataSource.getLatest(date)
        suspend fun getList()=dataSource.getList()

}