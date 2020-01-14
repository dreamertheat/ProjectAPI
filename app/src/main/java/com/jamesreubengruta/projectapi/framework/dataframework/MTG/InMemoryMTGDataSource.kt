package com.jamesreubengruta.projectapi.framework.dataframework.MTG

import com.jamesreubengruta.core.data.datasource.MTG.MTGCardOpenDatasource
import com.jamesreubengruta.core.data.datasource.NASA.NasaAPODOpenDataSource
import com.jamesreubengruta.core.domain.models.MTG.MtgCard
import com.jamesreubengruta.core.domain.models.NASA.NasaAPODModel

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