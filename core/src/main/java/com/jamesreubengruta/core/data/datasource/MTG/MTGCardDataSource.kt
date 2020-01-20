package com.jamesreubengruta.core.data.datasource.MTG

import com.jamesreubengruta.core.domain.models.MTG.MtgCard

interface MTGCardDataSource{

    suspend fun getList(name : String) : List<MtgCard>
    suspend fun add(card : MtgCard)

}