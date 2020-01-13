package com.jamesreubengruta.projectapi

import com.jamesreubengruta.projectapi.garbage.Broadcaster
import com.nhaarman.mockitokotlin2.mock
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.mockito.Mockito

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class BroadcasterTest {
    private lateinit var presenter : Broadcaster

    @Before
    fun init(){

    }

    @Test
    fun com(){
        assertEquals(Broadcaster("A",1).display(),"A1")
    }

    @Test
    fun test_mockito() {

        val br : Broadcaster = mock()
        Mockito.`when`(br.display()).thenReturn("sss")
        
    }
}
