package com.jamesreubengruta.core.data.repositories

import com.jamesreubengruta.core.data.datasource.NasaAPODDataSource
import com.jamesreubengruta.core.data.datasource.NasaAPODOpenDataSource
import com.jamesreubengruta.core.domain.models.NASA.NasaAPODModel

class NasaRepository(private val dataSource : NasaAPODDataSource, private val openData : NasaAPODOpenDataSource){

        suspend fun addData(data: NasaAPODModel)=dataSource.add(data)
        suspend fun getLatest(date:String)=dataSource.getLatest(date)
        suspend fun getList()=dataSource.getList()
         fun get()=openData.get()
        fun set(data: NasaAPODModel)=openData.set(data)
}  //TODO:: wild error message appeared!  Go debugger!