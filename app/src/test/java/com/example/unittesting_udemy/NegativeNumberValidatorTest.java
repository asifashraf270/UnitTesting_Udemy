package com.example.unittesting_udemy;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
public class NegativeNumberValidatorTest {

    NegativeNumberValidator reference;
    @Before
    public void init(){
        reference=new NegativeNumberValidator();
    }
    @Test
    public void test1(){
        boolean result=reference.isNegativeNumber(1);
        Assert.assertThat(result,is(false));
    }
    @Test
    public void test2(){
        boolean result=reference.isNegativeNumber(0);
        Assert.assertThat(result,is(false));
    }
    @Test
    public void test3(){
        boolean result=reference.isNegativeNumber(-1);
        Assert.assertThat(result,is(true));
    }
}