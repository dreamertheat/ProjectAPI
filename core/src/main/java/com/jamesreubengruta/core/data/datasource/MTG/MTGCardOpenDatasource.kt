package com.jamesreubengruta.core.data.datasource.MTG

import com.jamesreubengruta.core.domain.models.MTG.MtgCard

interface MTGCardOpenDatasource{

    fun set(card : MtgCard)
    fun get():MtgCard

}