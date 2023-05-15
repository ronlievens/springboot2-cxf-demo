package com.github.ronlievens.springboot2.demo.cxf.service;


import org.example.ICalculator;

public class CalculatorWebService implements ICalculator {

    @Override
    public Integer subtract(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
