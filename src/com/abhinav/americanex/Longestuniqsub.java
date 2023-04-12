package com.abhinav.americanex;

import java.util.HashMap;

public class Longestuniqsub {


    static int longestSubstring(String s){


        //to track already seen occurences
        HashMap<Character, Integer> seen = new HashMap<>();
        int maximum_length =0;

        //declare a window to start watching
        int start =0;

        for(int j=0 ; j < s.length(); j++){

         if(seen.containsKey(s.charAt(j))){
             start = Math.max(start, seen.get(s.charAt(j)) + 1);
            }
            seen.put(s.charAt(j),j);
            maximum_length = Math.max(maximum_length, j-start + 1);

        }
       return maximum_length;

    }

    public static void main(String[] args){

           String s = "geeksforgeeks";
           System.out.println("The input string :" + s);
           int length = longestSubstring(s);
           System.out.println("the length of longest substring is :"+ length);



    }
}
