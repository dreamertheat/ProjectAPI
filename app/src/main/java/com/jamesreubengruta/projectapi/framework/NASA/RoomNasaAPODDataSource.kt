package com.jamesreubengruta.projectapi.framework.NASA

import android.content.Context
import com.jamesreubengruta.core.data.datasource.NASA.NasaAPODDataSource
import com.jamesreubengruta.core.domain.models.NASA.NasaAPODModel
import com.jamesreubengruta.projectapi.framework.db.NASA.NasaAPODEntity
import com.jamesreubengruta.projectapi.framework.db.ProjectAPIDatabase

class RoomNasaAPODDataSource(context: Context) :NasaAPODDataSource {

    private val dao = ProjectAPIDatabase.getInstance(context).nasaAPODDAO();

    override suspend fun add(d: NasaAPODModel) {
        dao.addAPOD(NasaAPODEntity(copyright = d.copyright!!,date=d.date!!,explanation = d.explanation!!,media_type = d.mediaType!!,service_version = d.serviceVersion!!,
            title = d.title!!, url = d.url!!,hd_url = d.hdurl!!))
    }

    override suspend fun getLatest(date: String): NasaAPODModel =
        dao.getAPODLatest().let { d->
            NasaAPODModel(d.copyright,d.date,d.explanation,d.hd_url,d.media_type,d.service_version,
                d.title, d.url )
        }


    override suspend fun getList(): List<NasaAPODModel> =
        dao.getAPODList().map { d->
            NasaAPODModel(d.copyright,d.date,d.explanation,d.hd_url,d.media_type,d.service_version,
               d.title, d.url )
        }


    override suspend fun remove(_id : Int) {
        dao.removeAPOD(_id)
    }
}