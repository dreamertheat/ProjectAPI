package com.jamesreubengruta.projectapi.framework.di


import com.jamesreubengruta.core.interactors.MTG.MTGaddCard
import com.jamesreubengruta.core.interactors.MTG.MTGgetCard
import com.jamesreubengruta.core.interactors.MTG.MTGgetCardList
import com.jamesreubengruta.core.interactors.MTG.MTGsetCard
import com.jamesreubengruta.core.interactors.NASA.AddNasaAPOD
import com.jamesreubengruta.core.interactors.NASA.GetLatestNasaAPOD
import com.jamesreubengruta.core.interactors.NASA.GetNasaAPODList

data class Interactors (
        val mtGaddCard: MTGaddCard,
        val mtGgetCard: MTGgetCard,
        val mtGgetCardList: MTGgetCardList,
        val mtGsetCard: MTGsetCard,
        val addNasaAPOD: AddNasaAPOD,
        val getNasaAPODList: GetNasaAPODList,
        val getLatestNasaAPOD: GetLatestNasaAPOD
    )

   /* val mTGCardDataSource : MTGCardDataSource,
    val mTGCardOpenDataSource : MTGCardOpenDatasource,
    val nasaAPODDataSource : NasaAPODDataSource,
    val nasaAPODOpenDataSource : NasaAPODOpenDataSource,
    val nasaMediaDataSource : NasaMediaDataSource*/
