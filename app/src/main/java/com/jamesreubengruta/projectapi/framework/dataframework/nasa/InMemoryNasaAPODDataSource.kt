package com.jamesreubengruta.projectapi.framework.dataframework.nasa

import com.jamesreubengruta.core.data.datasource.nasa.NasaAPODOpenDataSource
import com.jamesreubengruta.core.domain.models.NASA.NasaAPODModel

class InMemoryOpenNasaAPODDataSource :
    NasaAPODOpenDataSource {

    private var apod : NasaAPODModel = NasaAPODModel.EMPTY

    override fun set(data: NasaAPODModel) {
        apod = data

    }

    override fun get(): NasaAPODModel  = apod
}