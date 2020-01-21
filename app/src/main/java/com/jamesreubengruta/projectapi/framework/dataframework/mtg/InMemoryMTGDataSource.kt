package com.jamesreubengruta.projectapi.framework.dataframework.mtg

import com.jamesreubengruta.core.data.datasource.mtg.MTGCardOpenDatasource
import com.jamesreubengruta.core.domain.models.MTG.MtgCard

class InMemoryMTGDataSource :
    MTGCardOpenDatasource {
    private var mtgCard : MtgCard ?= null
    override fun set(card: MtgCard) {
        mtgCard = card
    }

    override fun get(): MtgCard {
        return mtgCard!!
    }
}