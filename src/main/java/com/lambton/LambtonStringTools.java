/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{
    //1 - REVERSE STRING
    public static String reverse(String s)
    {
        char ch[] = s.toCharArray();
        String rev = " ";

        for (int i = ch.length - 1; i >= 0; i--)
        {
            rev += ch[i];
        }
        return rev;

    }
    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {
        String[] words = s.split("\\s+");
        int i = 0;
        String cap = "";
        if (words.length == 3) {
            cap = words[0].substring(0, 1).toUpperCase() + ". "
                    + words[1].substring(0, 1).toUpperCase() + ". "
                    + words[2].substring(0, 1).toUpperCase() + words[2].substring(1).toLowerCase();
        } else {
            cap = null;
        }
        return cap;
    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s) 
    {
        return null;
    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {
       return 0;
    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString)
    {
        return null;
    }
}
