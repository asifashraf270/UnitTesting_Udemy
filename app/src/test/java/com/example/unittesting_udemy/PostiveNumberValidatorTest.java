package com.example.unittesting_udemy;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
public class PostiveNumberValidatorTest {

    PostiveNumberValidator SUT;
    @Before
    public void  setUp(){
        SUT=new PostiveNumberValidator();

    }
    @Test
    public void test1(){
        boolean result=SUT.isPrositive(-1);
        Assert.assertThat(result,is(false));
    }
    @Test
    public void test2(){
        boolean result=SUT.isPrositive(0);
        Assert.assertThat(result,is(false));
    }
    @Test
    public void test3(){
        boolean result=SUT.isPrositive(1);
        Assert.assertThat(result,is(true));
    }
}