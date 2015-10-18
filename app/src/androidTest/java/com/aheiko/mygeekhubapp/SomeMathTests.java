package com.aheiko.mygeekhubapp;

import com.aheiko.mygeekhubapp.SecondFragment;

import junit.framework.TestCase;


/**
 * Created by andrey
 * on 13.10.2015
 */
public class SomeMathTests extends TestCase{

    public void testFact() throws Exception{
        assertEquals(1, SecondFragment.factorial(0));
        assertEquals(24, SecondFragment.factorial(4));
        assertEquals(120, SecondFragment.factorial(5));
    }

    public void testFibonacci() throws Exception{
        assertEquals(1, SecondFragment.fibonacci(1));
        assertEquals(1, SecondFragment.fibonacci(2));
        assertEquals(8, SecondFragment.fibonacci(6));
    }

}
