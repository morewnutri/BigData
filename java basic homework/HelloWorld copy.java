package com.example.helloworld;
/*
提示用户输入年月日信息，判断这一天是这一年中的第几天并打印。
 */

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("year:");
        int year = sc1.nextInt();
        System.out.println("month");
        int month = sc2.nextInt();
        System.out.println("day");
        int day = sc3.nextInt();
        int count = 0;
        switch (month-1){
            case 12:
                count += 31;
            case 11:
                count += 30;
            case 10:
                count += 31;
            case 9:
                count += 30;
            case 8:
                count += 31;
            case 7:
                count += 31;
            case 6:
                count += 30;
            case 5:
                count += 31;
            case 4:
                count += 30;
            case 3:
                count += 31;
            case 2:
                if(year%400==0 || (year%4==0&&year%100!=0)){
                    count = 29;
                }else {
                    count = 28;
                }
            case 1:
                count += 31;
        }
        count +=day;
        System.out.println("today is "+count+"th day");
    }
}
