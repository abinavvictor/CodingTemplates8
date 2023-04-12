package com.abhinav.americanex;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Categorycourse {

    public int minNum(int [] arr){
     List<Integer> min =  Arrays.stream(arr).boxed().collect(Collectors.toList());
  return min.stream().sorted().findFirst().get();

    }
public static void main(String [] args){

        int [] arr= new int[]{6,13,18,20, 26};
        Categorycourse minboy = new Categorycourse();
        int  minkid = minboy.minNum(arr);
        System.out.println("the min number in list:"+ minkid);
}

}
