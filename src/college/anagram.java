package college; 
import java.util.Scanner;
import java.util.Arrays;
public class anagram {
   public static void isAnagram(String s1,String s2){
   String copyofs1=s1.replaceAll("\\s"," ");
   String copyofs2=s2.replaceAll("\\s"," ");
   boolean status=true;
   if(copyofs1.length()==copyofs2.length()){
       char[] s1Array=copyofs1.toLowerCase().toCharArray();
       char[] s2Array=copyofs2.toLowerCase().toCharArray();
       Arrays.sort(s1Array);
       Arrays.sort(s2Array);
       status=Arrays.equals(s1Array,s2Array);
       if(status){
       System.out.println(s1+" and "+s2+" are anagrams!!!");}
       else{
       System.out.println(s1+" and "+s2+" are not anagrams!!!");
   }}
   else{
       System.out.println(s1+" and "+s2+" are not anagrams!!!");
   }
   }
    public static void main(String args[]){
        String s1,s2;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your first word:");
         s1=sc.nextLine();
         System.out.println("Enter your second word to be compared with:");
         s2=sc.nextLine();
         isAnagram(s1,s2);
    }
}