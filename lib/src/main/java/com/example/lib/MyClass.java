package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入時間(xx:xx)");
        String time = sc.next();
        String ar [] = time.split(":");

        int hour = Integer.parseInt(ar[0]);
        int mm = Integer.parseInt(ar[1]);

        if(hour == 7 && mm >=30 ) {
            System.out.println("up");
        }

        else if(hour>7&&hour<17){
            System.out.println("up");
        }else{
            System.out.println("down");
        }

    }

}
