package com.sapient.asde.service;

import java.util.HashMap;
public class MyString {
    private  String message;

    public MyString() {
    }

    public MyString(String message) {
        this.message = message;
    }

    public Boolean isPalindrome(){
        if(message==null){
            return true;
        }
        StringBuilder sb=new StringBuilder(message);
        sb.reverse();
        String rev=sb.toString();
        if(message.equalsIgnoreCase(rev)){
            return true;
        }else{
            return false;
        }
    }
    public String getAcronym(){
        String array[]=message.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for(String i:array){
            char inter=i.charAt(0);
            stringBuilder.append(Character.toUpperCase(inter));
        }
        return stringBuilder.toString();
    }
    public  Integer nOccurrences(Character cha){
        if(cha==null){
            return null;
        }
        Integer count=0;
        char[] strArray = message.toCharArray();
        for (char c : strArray) {
            if(c==cha){
                count++;
            }
        }
        return count;
    }
}
