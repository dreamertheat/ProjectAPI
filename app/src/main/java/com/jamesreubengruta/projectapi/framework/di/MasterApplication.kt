package com.jamesreubengruta.projectapi.framework.di

import android.app.Application
import com.jamesreubengruta.core.data.repositories.MTGRepository
import com.jamesreubengruta.core.data.repositories.MasterRepository
import com.jamesreubengruta.core.data.repositories.NasaRepository
import com.jamesreubengruta.projectapi.framework.dataframework.MTG.InMemoryMTGDataSource
import com.jamesreubengruta.projectapi.framework.dataframework.NASA.InMemoryOpenNasaAPODDataSource
import com.jamesreubengruta.projectapi.framework.dataframework.NASA.RoomNasaAPODDataSource

class MasterApplication() : Application() {

    val mas = MasterRepository.getInstance(NasaRepository(RoomNasaAPODDataSource(this),InMemoryOpenNasaAPODDataSource() ),
        MTGRepository(InMemoryMTGDataSource(),InMemoryMTGDataSource()))

    override fun onCreate() {
        super.onCreate()



    }

}