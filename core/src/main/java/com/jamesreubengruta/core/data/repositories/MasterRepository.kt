package com.jamesreubengruta.core.data.repositories

import com.jamesreubengruta.core.domain.models.NASA.NasaAPODModel
class MasterRepository private constructor(private val nasaREPO : NasaRepository){





    companion object{
        @Volatile
        var master_repo : MasterRepository?=null


        fun getInstance(nasaREPO : NasaRepository)=
            //if  master_repo is null, instantiate
            master_repo ?: synchronized(this){
                master_repo ?: MasterRepository(nasaREPO).apply { master_repo = this }
            }


    }

}