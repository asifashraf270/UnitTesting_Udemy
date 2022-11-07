package com.example.unittesting_udemy;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import  static  org.hamcrest.CoreMatchers.is;

public class EvenNumberValidatorTest {
    EvenNumberValidator reference;
    @Before
    public void init(){
        reference=new EvenNumberValidator();
    }
    @Test
    public void test1(){
        boolean result=reference.isEvenNumber(2);
        Assert.assertThat(result,is(true));
    }
    @Test
    public void test2(){
        boolean result=reference.isEvenNumber(1);
        Assert.assertThat(result,is(false));
    }
}