package college; 
import java.util.Scanner;
public class anagram {
   public static void last(){
       System.out.println("It is not an ANAGRAM!!!");
       
   }
    public static void main(String args[]){
         String word1,word2;
         int len1,len2,i,j,count=0;
         char let1,let2;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your first word:");
         word1=sc.nextLine();
         System.out.println("Enter your second word to be compared with:");
         word2=sc.nextLine();
         len1=word1.length();
         len2=word2.length();
         if(len1==len2)
         {
         for(i=0;i<=len1-1;i++){
             let1=word1.charAt(i);
             for(j=0;j<=len2-1;j++){
                let2=word2.charAt(j);
                if(let1==let2){
                    count++;
                    continue;
                }else{
                     last();
                     break;
                }
                }
             }
         
         }
    if (count==len1-1) 
        System.out.println("These two words are ANAGRAM of each other!!!");
    }    
}
