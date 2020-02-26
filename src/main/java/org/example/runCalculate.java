package org.example;

public class runCalculate {

    public int addNumber(int a,int b) {
        return a+b;
    }

    public int sub(int x, int y) { return x-y;};
    public int dev (int x, int y) { if (y==0) {throw new ArithmeticException();}
    return x/y; }
}


