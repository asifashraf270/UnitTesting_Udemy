package com.example.unittesting_udemy;

public class StringReverser {

    public String reverse(String input){
        String result="";
        for (int i=input.length()-1;i>=0;i--){
            result = result+input.charAt(i);
        }
        return result;
    }
}
