package com.appdynamics.shubham.sanity;


import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups = {"sanity"})
public class SampleTest {

    @BeforeSuite
    private void beforeSuite() {
        System.out.println("before suite");
    }

    @AfterSuite
    private void afterSuite() {
        System.out.println("after suite");
    }

    @BeforeGroups(groups = {"sanity"})
    private void beforeGroups() {
        System.out.println("before groups");
    }

    @AfterGroups(groups = {"sanity"})
    private void afterGroups() {
        System.out.println("after groups");
    }

    @BeforeTest
    private void beforeTest() {
        System.out.println("before test");
    }

    @AfterTest
    private void afterTest() {
        System.out.println("After test");
    }

    @Test(groups = {"sanity"})
    public void testOne() {
        System.out.println("sample test shubham and");
    }

    @Test(groups = {"sanity"})
    public void testTwo() {
        System.out.println("Test two");
    }

    @Test
    protected void testThree() {
        System.out.println("Test three");
    }

    @Test
    void testFour() {
        System.out.println("Test four");
    }

}
