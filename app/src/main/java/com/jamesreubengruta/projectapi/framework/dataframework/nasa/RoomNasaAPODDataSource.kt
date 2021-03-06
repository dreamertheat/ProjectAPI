package com.jamesreubengruta.projectapi.framework.dataframework.nasa

import android.content.Context
import com.jamesreubengruta.core.data.datasource.nasa.NasaAPODDataSource
import com.jamesreubengruta.core.domain.models.NASA.NasaAPODModel
import com.jamesreubengruta.projectapi.framework.dataframework.db.nasa.NasaAPODEntity
import com.jamesreubengruta.projectapi.framework.dataframework.db.ProjectAPIDatabase

class RoomNasaAPODDataSource(context: Context) :NasaAPODDataSource {

    private val dao = ProjectAPIDatabase.getInstance(context).nasaAPODDAO()

    override suspend fun add(d: NasaAPODModel) {
        dao.addAPOD(NasaAPODEntity(copyright = d.copyright!!,date=d.date!!,explanation = d.explanation!!,media_type = d.mediaType!!,service_version = d.serviceVersion!!,
            title = d.title!!, url = d.url!!,hd_url = d.hdurl!!))
    }

    override suspend fun getLatest(date: String): NasaAPODModel =
        dao.getAPODLatest().let { d->
            NasaAPODModel(d.copyright,d.uid,d.date,d.explanation,d.hd_url,d.media_type,d.service_version,
                d.title, d.url )
    }


    override suspend fun getList(): List<NasaAPODModel> =
        dao.getAPODList().map { d->
            NasaAPODModel(d.copyright,d.uid,d.date,d.explanation,d.hd_url,d.media_type,d.service_version,
               d.title, d.url )
    }


    override suspend fun remove(mod : NasaAPODModel) {
        dao.removeAPOD(NasaAPODEntity(mod.uid,mod.copyright,mod.date,mod.explanation,mod.mediaType,mod.serviceVersion,
            mod.title,mod.url,mod.hdurl))
    }
}