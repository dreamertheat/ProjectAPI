package com.jamesreubengruta.projectapi.garbage

class Broadcaster(var name : String, var id : Int) {



    fun display() = "$name$id"



    fun setValue(name : String, id : Int){
        this.name = name
        this.id = id
    }

}