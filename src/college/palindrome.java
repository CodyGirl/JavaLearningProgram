package college;
import java.util.Scanner;
public class palindrome {
public static void main(String args[]){
    String word;
    String reverse="";
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your desired word");
    word=sc.nextLine();
    int len;
    len =word.length();
    for (int i=len-1;i>=0;i--){
    reverse = reverse + word.charAt(i);
    }
    System.out.println("The reverse of the word entered by you is: "+reverse);
    if(word.equals(reverse)){
    System.out.println("It is a palindrome!!!");
    }else
    {
    System.out.println("It is not a palindrome!!!");
    }
}
}
          
    

