package com.jamesreubengruta.core.data.repositories

class Main {



    companion object {
        @JvmStatic
        fun main(args:Array<String>) {
            val f = name
            println(name.size)
        }

        val name : ArrayList<String> by lazy{
            ArrayList<String>().also {
                it.add("asdas")
                it.add("asdas")
                it.add("asdas")
            }
        }

        fun alsoApplyRunWith(){
            val d = Entity(12,"Entity01");
            var num = 123;
            val m = d.apply {

                _id=229
            }.apply {
                _id=2
                num++
            }.let {
                it._id=999
                Being(it._id,it.name)

            }.apply{
                _id = 333
                num++
            }.also {
                it._id=1
                num++
            }.run {

                Entity(_id,name)

            }

            val ff = m.copy()
            println("final object " +m!!.whoIS())
            println(ff)
        }
    }


    data class Entity(var _id : Int, var name : String){
        fun whoIS() = "Entity $_id"

    }
    data class Being(var _id : Int, var name : String){
        fun whoIS() = "Being $_id"

    }
}