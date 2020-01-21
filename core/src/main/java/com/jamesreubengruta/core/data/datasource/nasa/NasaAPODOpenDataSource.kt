package com.jamesreubengruta.core.data.datasource.nasa

import com.jamesreubengruta.core.domain.models.NASA.NasaAPODModel

interface NasaAPODOpenDataSource {

     fun set(data: NasaAPODModel)
     fun get ():NasaAPODModel


}