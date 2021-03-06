package ru.orangesoftware.financisto.test.activity;

import android.test.ActivityInstrumentationTestCase2;

import ru.orangesoftware.financisto.activity.MainActivity;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class ru.orangesoftware.financisto.test.activity.MainActivityTest \
 * ru.orangesoftware.financisto.test.tests/android.test.InstrumentationTestRunner
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super("ru.orangesoftware.financisto", MainActivity.class);
    }

}
