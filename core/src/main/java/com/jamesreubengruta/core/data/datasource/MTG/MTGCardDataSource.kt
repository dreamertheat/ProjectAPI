package com.jamesreubengruta.core.data.datasource.MTG

import com.jamesreubengruta.core.domain.models.MTG.MtgCard

interface MTGCardDataSource{

    fun getList() : List<MtgCard>
    fun add(card : MtgCard)

}