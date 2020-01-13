package com.jamesreubengruta.projectapi.presentation.activities.login_profile

import android.test.mock.MockApplication
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.rule.ActivityTestRule
import com.jamesreubengruta.projectapi.R
import com.jamesreubengruta.projectapi.garbage.Broadcaster
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test


class LoginProfileTest {

    @Rule @JvmField
    var rule : ActivityTestRule<LoginProfile> = ActivityTestRule<LoginProfile>(LoginProfile::class.java)


    @Before
    fun setUp() {

        rule.activity.supportFragmentManager.beginTransaction()

    }

    @Test
    fun testEditTextVisibility(){

        //edittext username
        Espresso.onView(ViewMatchers.withId(R.id.et_username)).check(ViewAssertions.matches(
            ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.et_username)).perform(ViewActions.clearText(),
            ViewActions.typeText("TheQuickBrownFoxyDogs"))
        //close
        Espresso.closeSoftKeyboard()
        //edittext password
        Espresso.onView(ViewMatchers.withId(R.id.et_password)).check(ViewAssertions.matches(
            ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.et_password)).perform(ViewActions.clearText(),
            ViewActions.typeText("TheQuickBrownFoxyDogs"))
        //close
        Espresso.closeSoftKeyboard()
        //button
        Espresso.onView(ViewMatchers.withId(R.id.bt_login)).perform(ViewActions.click())

        Espresso.onView(ViewMatchers.withId(R.id.rv_list)).check(ViewAssertions.matches(
            ViewMatchers.isDisplayed()))



    }

    @After
    fun tearDown() {
    }
}