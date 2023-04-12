package com.abhinav.americanex;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Amstr {
    public static void main(String[] args){

        Integer [] inputarray ={1,2,3,4,5};
        List<Integer> numberList = Arrays.asList(inputarray);
        Optional<Integer> output = numberList.stream().reduce((a,b)-> a*b);
        if(output.isPresent()){
            System.out.println("Array mply: " + output );
        }
        else{
            System.out.println("List is empty");
        }

    }
}
