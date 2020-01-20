package com.jamesreubengruta.core.data.repositories

import com.jamesreubengruta.core.data.datasource.MTG.MTGCardDataSource
import com.jamesreubengruta.core.data.datasource.MTG.MTGCardOpenDatasource
import com.jamesreubengruta.core.domain.models.MTG.MtgCard

class MTGRepository(val mtgds: MTGCardDataSource, val mtgods: MTGCardOpenDatasource){

    suspend fun getCardList(name : String) = mtgds.getList(name)
    suspend fun addCard(card : MtgCard) = mtgds.add(card)
    fun getCard() = mtgods.get()
    fun setCard(card : MtgCard) = mtgods.set(card)


}