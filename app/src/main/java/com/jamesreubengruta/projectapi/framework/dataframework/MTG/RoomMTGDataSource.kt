package com.jamesreubengruta.projectapi.framework.dataframework.MTG

import android.content.Context
import com.jamesreubengruta.core.data.datasource.MTG.MTGCardDataSource
import com.jamesreubengruta.core.domain.models.MTG.MtgCard
import com.jamesreubengruta.projectapi.framework.dataframework.db.ProjectAPIDatabase

class RoomMTGDataSource(context : Context) : MTGCardDataSource{
    private val dao = ProjectAPIDatabase.getInstance(context).mtgDAO()
    override suspend fun getList(): List<MtgCard> {
        return dao.getCards()
    }

    override suspend fun add(card: MtgCard) {
        dao.addCard(card)
    }
}