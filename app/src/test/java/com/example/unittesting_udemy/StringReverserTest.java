package com.example.unittesting_udemy;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
public class StringReverserTest {

    StringReverser reference;

    @Before
    public void init(){
        reference=new StringReverser();
    }

    @Test
    public void test1(){
        String result=reference.reverse("");
        assertThat(result,is(""));
    }
    @Test
    public void test2(){
        String result=reference.reverse("a");
        assertThat(result,is("a"));
    }
    @Test
    public void test3(){
        String result=reference.reverse("ab");
        assertThat(result,is("ba"));
    }
    @Test
    public void test4(){
        String result=reference.reverse("abc");
        assertThat(result,is("cba"));
    }
}