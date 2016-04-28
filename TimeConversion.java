
package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String[] time1 = time.split(":");
        String hr=time1[0];
        int num=Integer.parseInt(hr);
        String min=time1[1];
        String sec=time1[2];
        char[] sec1 = sec.toCharArray();
        char meridian=sec1[2],m1='A',m2='P';
        if(num==12 && meridian==m1){
            String[] sec2=sec.split("A");
            String s1=sec2[0];
            System.out.println("00:"+min+":"+s1);}
        else if(num==12 && meridian==m2){
            String[] sec3=sec.split("P");
            String s2=sec3[0];
                System.out.println("12:"+min+":"+s2);}
        else if(meridian==m1){
            String[] sec2=sec.split("A");
            String s1=sec2[0];
            System.out.println(hr+":"+min+":"+s1);}
                                 
        else{
            int hr24= num+12;
            String[] sec3=sec.split("P");
            String s2=sec3[0];
            System.out.println(hr24+":"+min+":"+s2); } 
               }
             }
         
    
