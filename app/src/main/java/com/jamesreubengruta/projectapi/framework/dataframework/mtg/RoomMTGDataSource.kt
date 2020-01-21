package com.jamesreubengruta.projectapi.framework.dataframework.mtg

import android.content.Context
import com.jamesreubengruta.core.data.datasource.mtg.MTGCardDataSource
import com.jamesreubengruta.core.domain.models.MTG.MtgCard
import com.jamesreubengruta.projectapi.framework.dataframework.db.ProjectAPIDatabase
import com.jamesreubengruta.projectapi.framework.dataframework.db.mtg.MTGCardEntity

class RoomMTGDataSource(context : Context) : MTGCardDataSource{
    private val dao = ProjectAPIDatabase.getInstance(context).mtgDAO()

    override suspend fun getList(name : String): List<MtgCard> {
        return dao.getList(name)
    }

    override suspend fun add(card: MtgCard) {
        dao.add(MTGCardEntity(card.uid,card.id,card.artist,card.name,card.flavor,card.life,card.power,
            card.manaCost,card.toughness,card.text,card.type,card.imageUrl))
    }
}