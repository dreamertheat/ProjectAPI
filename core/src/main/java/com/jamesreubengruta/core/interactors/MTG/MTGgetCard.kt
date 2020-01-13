package com.jamesreubengruta.core.interactors.MTG

import com.jamesreubengruta.core.data.repositories.MTGRepository
import com.jamesreubengruta.core.domain.models.MTG.MtgCard

class MTGgetCard (val repo : MTGRepository){

    operator fun invoke() : MtgCard =  repo.getCard()

}