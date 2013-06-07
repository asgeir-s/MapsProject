package com.exaple.mapdemo.test;

import android.test.suitebuilder.TestSuiteBuilder;

import junit.framework.Test;
import junit.framework.TestSuite;


/**
 * A test suite containing all tests for my application.
 *
 * This is a standard class for all projects
 *
 * To run the test:
 * 1. go to terminal
 * 2. navigate to project directory
 * 3. run "./gradlew connectedCheck"
 * 4. check result in "file:///home/asgeir/Dropbox/Development/Android/Workspace/RovdyrProject/Rovdyr/build/reports/instrumentTests/connected/index.html"
 */
public class AllTests extends TestSuite {
    public static Test suite() {
        return new TestSuiteBuilder(AllTests.class).includeAllPackagesUnderHere().build();
    }
}
