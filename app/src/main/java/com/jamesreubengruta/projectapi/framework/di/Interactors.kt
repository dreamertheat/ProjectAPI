package com.jamesreubengruta.projectapi.framework.di

import com.jamesreubengruta.core.data.datasource.MTG.MTGCardDataSource
import com.jamesreubengruta.core.data.datasource.MTG.MTGCardOpenDatasource
import com.jamesreubengruta.core.data.datasource.NASA.NasaAPODDataSource
import com.jamesreubengruta.core.data.datasource.NASA.NasaAPODOpenDataSource
import com.jamesreubengruta.core.data.datasource.NASA.NasaMediaDataSource

data class Interactors (
    val mTGCardDataSource : MTGCardDataSource,
    val mTGCardOpenDataSource : MTGCardOpenDatasource,
    val nasaAPODDataSource : NasaAPODDataSource,
    val nasaAPODOpenDataSource : NasaAPODOpenDataSource,
    val nasaMediaDataSource : NasaMediaDataSource

    ){


}