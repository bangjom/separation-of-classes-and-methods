package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GugudanMain {
    public static void main(String[] args) {
        List<String> splitedValue = GugudanInput.split(GugudanInput.input());
        int first = Integer.parseInt(splitedValue.get(0));
        int second = Integer.parseInt(splitedValue.get(1));
        for (int j=2;j<=first;j++){
            GugudanOutput.print(Gugudan.calculate(j,second));
        }
    }
}
