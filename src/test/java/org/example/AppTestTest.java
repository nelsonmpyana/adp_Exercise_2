package org.example;
import org.junit.jupiter.api.BeforeEach;
import  org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import static org.junit.Assert.*;

public class AppTestTest {

    @Test
    public void test() {

        runCalculate test =new runCalculate();
        int result= test.addNumber(5,8);
        assertEquals(12,result);

    }
    public void testTimeOut() {
    }


}