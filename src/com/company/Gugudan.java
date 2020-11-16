package com.company;

import java.util.Scanner;

public class Gugudan {

    public static int[] calculate(int times,int many){
        int[] arr = new int[many];
        for(int i = 0;i<many;i++){
            arr[i]= times*(i+1);
        }
        return arr;
    }

}
