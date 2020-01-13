package com.jamesreubengruta.core.interactors.MTG

import com.jamesreubengruta.core.data.repositories.MTGRepository
import com.jamesreubengruta.core.domain.models.MTG.MtgCard

class MTGsetCard (val repo : MTGRepository){

    operator fun invoke(card : MtgCard) = repo.setCard(card)

}