package com.abhinav.americanex;

import java.util.HashSet;
import java.util.Set;

public class LongUNiQSUBwithset {

    public int longestSubwithset(String s){
        Set<Character> myset = new HashSet<>();
        int maxLen =0;
        int left =0;

        for(int right =0; right < s.length(); right++){

            while(! myset.add(s.charAt(right))){
                myset.remove(s.charAt(left++));
            }

            maxLen = Math.max(maxLen, right-left+1);
        }

        return maxLen;
    }
}
