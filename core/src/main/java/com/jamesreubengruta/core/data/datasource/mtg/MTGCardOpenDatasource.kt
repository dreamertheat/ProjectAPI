package com.jamesreubengruta.core.data.datasource.mtg

import com.jamesreubengruta.core.domain.models.MTG.MtgCard

interface MTGCardOpenDatasource{

    fun set(card : MtgCard)
    fun get():MtgCard

}