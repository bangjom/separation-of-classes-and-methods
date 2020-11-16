package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GugudanInput {
    public static String input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static List<String> split(String inputValue){
        return Arrays.asList(inputValue.split(","));
    }
}
