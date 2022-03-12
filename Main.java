package com.company;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static String[] getReverseArray(String[] arr) {
        //return reverse arr;
        //for example: -- ["Rishi", "Prajapati"]  ---> ["Prajapati", "Rishi"]
        //Note: Do not create a new array inside this function
        //reverse arr only.
        Collections.reverse(Arrays.asList(arr));
        return arr; //do not change this line
    }
    public static void main(String[] args) {
	// write your code here
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the value of n");
                int n=sc.nextInt();
                String[] arr=new String[n];
                System.out.println("Enter the values of array");
                for(int i=0;i<n;i++) {
                    String tmps=sc.next();
                    arr[i]=tmps;
                }
                String[] resultArr=getReverseArray(arr);
                for(String s:resultArr) {
                    System.out.println(s);
                }
            }
    }

