/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example;

import java.util.Locale;

/**
 *
 * @author Alonso del Arte
 */
public class HelloWorld {
    
    @org.testframe.annotations.warnings.CustomWarning("EXAMPLATE")
    @org.testframe.annotations.warnings.Untested
    static String greeting(Locale locale) {
        return "World, hello?";
    }
    
    @org.testframe.annotations.warnings.Untested
    public static void main(String[] args) {
        System.out.println("World, hello?");
    }
    
}
