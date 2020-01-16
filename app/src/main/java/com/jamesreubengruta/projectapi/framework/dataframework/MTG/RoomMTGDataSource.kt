package com.jamesreubengruta.projectapi.framework.dataframework.MTG

import android.content.Context
import com.jamesreubengruta.core.data.datasource.MTG.MTGCardDataSource
import com.jamesreubengruta.core.domain.models.MTG.MtgCard
import com.jamesreubengruta.projectapi.framework.dataframework.db.MTG.MTGCardDAO

class RoomMTGDataSource(context : Context) : MTGCardDataSource{
    private val dao = MTGCardDAO()
    override fun getList(): List<MtgCard> {

    }

    override fun add(card: MtgCard) {

    }
}