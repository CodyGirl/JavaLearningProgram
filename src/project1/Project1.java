package project1;

import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int a = s.nextInt();
       int start =0;
       int second = 1;
       System.out.print(start + "   " + second+"  ");
       for(int i=0; i<a;i++){
           int third = second + start;
           System.out.print(third + "   ");
           start = second;
           second = third;
       }
    }
}
