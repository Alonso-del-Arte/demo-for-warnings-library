/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example;

import java.util.Locale;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Alonso del Arte
 */
public class HelloWorldNGTest {
    
    public HelloWorldNGTest() {
    }

    /**
     * Test of greeting method, of class HelloWorld.
     */
    @Test
    public void testGreeting() {
        System.out.println("greeting");
        Locale locale = null;
        String expResult = "";
        String result = HelloWorld.greeting(locale);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class HelloWorld.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        HelloWorld.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
