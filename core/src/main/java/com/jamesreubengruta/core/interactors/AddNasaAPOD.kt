package com.jamesreubengruta.core.interactors

import com.jamesreubengruta.core.data.repositories.NasaRepository
import com.jamesreubengruta.core.domain.models.NASA.NasaAPODModel

class AddNasaAPOD(private val repo:NasaRepository) {

         suspend operator  fun  invoke (data:NasaAPODModel)=repo.addData(data)

}