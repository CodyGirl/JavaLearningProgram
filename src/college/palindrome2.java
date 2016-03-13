package college;
import java.util.Scanner;
public class palindrome2 {
    public static void main(String args[]){
    String word,reverse="";
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your desired to be checked for PALINDROME:");
    word=sc.nextLine();
    int i,j,length;
    length=word.length();
    for(i=length-1;i>=(length-1)/2;i--)
    {
    reverse=reverse+word.charAt(i);
    }
    for(j=(length-1)/2 - 1;j<(length-1)/2 && j>=0;j--)
    reverse=reverse+word.charAt(j);
    
    System.out.println("The reverse of given word is: "+reverse);
    if(word.equals(reverse))
    {
        System.out.println("It is a PALINROME!!!");
    }  else
    {
        System.out.println("It is not a PALINROME!!!");
    }   
}
}