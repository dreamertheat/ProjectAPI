package com.jamesreubengruta.core.interactors.MTG

import com.jamesreubengruta.core.data.repositories.MTGRepository
import com.jamesreubengruta.core.domain.models.MTG.MtgCard

class MTGaddCard (val repo : MTGRepository){

    suspend operator fun invoke(card : MtgCard){
        repo.addCard(card)
    }

}