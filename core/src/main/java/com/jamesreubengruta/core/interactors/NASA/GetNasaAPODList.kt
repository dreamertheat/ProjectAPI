package com.jamesreubengruta.core.interactors.NASA

import com.jamesreubengruta.core.data.repositories.NasaRepository
import com.jamesreubengruta.core.domain.models.NASA.NasaAPODModel

class GetNasaAPODList(private val repo:NasaRepository) {

   suspend operator  fun  invoke(date:String)=repo.getLatest(date)


}