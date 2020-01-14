package com.jamesreubengruta.core.data.repositories

class MasterRepository private constructor(private val nasaREPO : NasaRepository,
                                           private val mtgRepository: MTGRepository){





    companion object{
        @Volatile
        var master_repo : MasterRepository?=null


        fun getInstance(nasaREPO : NasaRepository, mtgRepository: MTGRepository)=
            //if  master_repo is null, instantiate
            master_repo ?: synchronized(this){
                master_repo ?: MasterRepository(nasaREPO, mtgRepository).apply { master_repo = this }
            }


    }

}