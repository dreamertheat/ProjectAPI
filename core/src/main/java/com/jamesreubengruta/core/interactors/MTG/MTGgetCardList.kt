package com.jamesreubengruta.core.interactors.MTG

import com.jamesreubengruta.core.data.repositories.MTGRepository
import com.jamesreubengruta.core.domain.models.MTG.MtgCard

class MTGgetCardList (val repo : MTGRepository){

    suspend operator fun invoke(name : String) : List<MtgCard> = repo.getCardList(name)

}