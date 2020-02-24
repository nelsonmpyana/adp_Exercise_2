package org.example;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import  org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class AppTestTest {

    //failed test
    @Test
    public void testaddPass() {

        runCalculate test =new runCalculate();
        int result= test.addNumber(5,8);
        assertEquals(13,result);

    }
    @Test
    public void testAddFail () {

        runCalculate failtest = new runCalculate();
        int results = failtest.addNumber(5, 8);
        assertEquals(12, results);
    }

    //timeout test

    @Test
    public void testTimeOut() {

    }


}