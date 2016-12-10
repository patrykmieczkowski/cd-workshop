package com.mieczkowski.cd_ease;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;

/**
 * Created by Patryk Mieczkowski on 10.12.2016
 */

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void shouldDisplayHelloWorld() {

        onView(withId(R.id.text_view))
                .check(matches(withText("Hello World!")));

    }
}
