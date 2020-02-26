package org.example;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.*;
import org.junit.jupiter.api.BeforeEach;
import  org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;


public class AppTestTest {

    @Test
    public void test() {

        runCalculate test =new runCalculate();
        int result= test.addNumber(5,8);
        assertEquals(12,result);

    }

    @Ignore
    @Test
    public void testSub() {
        runCalculate test =new runCalculate();
        int x=10;
        int y =20;
        assertEquals(-10, test.sub(x,y));
    }


    @Ignore
    @Test(expected=ArithmeticException.class, timeout=2000)
    public void dev () {
        runCalculate test =new runCalculate();
        Assert.assertEquals(2,test.dev(4,0));

    }

}