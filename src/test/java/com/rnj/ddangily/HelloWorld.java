package com.rnj.ddangily;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a - b);

    }
}
//    public String calculate(int a, int b){
//        String result = "";
//
//        if (a > b){
//            result = ">";
//        } else if (a < b){
//            result = "<";
//        } else if (a == b){
//            result = "==";
//        }
//
//
//        return result;
//    }
