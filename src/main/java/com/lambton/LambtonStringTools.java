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
    public static char mostFrequent(String s)
    {

        int ccount = 256;
        int[] count = new int[ccount];
        int i;  //usedinloops
        for (i = 0; i < s.length(); i++)
            (count[s.charAt(i)])++;
        int mostFrequently = 0;
        for (i = 0; i < ccount; i++) {
            if (count[i] > count[mostFrequently]) {
                mostFrequently = i;
            } else if (count[i] == count[mostFrequently]) {
                mostFrequently = i;
            }
        }
        return (char) mostFrequently;
    }

    }

    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s)
    {
        int decimal=0;

        decimal = Integer.parseInt(s, 2);

        return decimal;


    }

    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString)
    {

}
