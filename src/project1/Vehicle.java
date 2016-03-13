package project1;

import java.util.Scanner;

public class Vehicle
{
    public static int fun(int a,int b){
        int d=a+b;
        System.out.println("hello world");
        return d;    
    }
    
    public static void main(String args[]){
       int a,b;
       Scanner s=new Scanner(System.in);
       a=s.nextInt();
       b=s.nextInt();
       int c= fun(a,b);
       System.out.println(c);
    }
    
}

