package com.jamesreubengruta.projectapi.framework

import android.provider.DocumentsContract
import com.jamesreubengruta.core.data.datasource.NasaAPODDataSource
import com.jamesreubengruta.core.data.datasource.NasaAPODOpenDataSource
import com.jamesreubengruta.core.domain.models.NASA.NasaAPODModel

class InMemoryOpenNasaAPODDataSource : NasaAPODOpenDataSource {

    private var apod : NasaAPODModel = NasaAPODModel.EMPTY

    override fun set(data: NasaAPODModel) {
        apod = data
    }

    override fun get(): NasaAPODModel  = apod
}