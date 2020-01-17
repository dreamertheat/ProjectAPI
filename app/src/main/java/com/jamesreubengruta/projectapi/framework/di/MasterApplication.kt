package com.jamesreubengruta.projectapi.framework.di

import android.app.Application
import com.jamesreubengruta.core.data.repositories.MTGRepository
import com.jamesreubengruta.core.data.repositories.MasterRepository
import com.jamesreubengruta.core.data.repositories.NasaRepository
import com.jamesreubengruta.core.interactors.MTG.MTGaddCard
import com.jamesreubengruta.core.interactors.MTG.MTGgetCard
import com.jamesreubengruta.core.interactors.MTG.MTGgetCardList
import com.jamesreubengruta.core.interactors.MTG.MTGsetCard
import com.jamesreubengruta.core.interactors.NASA.AddNasaAPOD
import com.jamesreubengruta.core.interactors.NASA.GetLatestNasaAPOD
import com.jamesreubengruta.core.interactors.NASA.GetNasaAPODList
import com.jamesreubengruta.projectapi.framework.dataframework.MTG.InMemoryMTGDataSource
import com.jamesreubengruta.projectapi.framework.dataframework.MTG.RoomMTGDataSource
import com.jamesreubengruta.projectapi.framework.dataframework.NASA.InMemoryOpenNasaAPODDataSource
import com.jamesreubengruta.projectapi.framework.dataframework.NASA.RoomNasaAPODDataSource

class MasterApplication() : Application() {
    //
    val mas = MasterRepository.getInstance(NasaRepository(RoomNasaAPODDataSource(this),InMemoryOpenNasaAPODDataSource() ),
        MTGRepository(RoomMTGDataSource(this),InMemoryMTGDataSource()))

    override fun onCreate() {
        super.onCreate()

        MasterViewModelFactory().injector(this,
            Interactors(MTGaddCard(mas.mtgRepository),
            MTGgetCard(mas.mtgRepository),
            MTGgetCardList(mas.mtgRepository),
            MTGsetCard(mas.mtgRepository),
            AddNasaAPOD(mas.nasaREPO),
            GetNasaAPODList(mas.nasaREPO),
            GetLatestNasaAPOD(mas.nasaREPO)
           )


        )

    }

}