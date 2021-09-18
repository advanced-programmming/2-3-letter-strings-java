package com.co.pa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        calculateCount(value);
    }

    public static void calculateCount(String value){
        int count = 0;
        char[] array = value.toCharArray();
        for(int i = 0; i < value.length(); i++)
            if(array[i] != '-' && array[i] != ' ')
                count++;

        System.out.println(count);
    }
}
