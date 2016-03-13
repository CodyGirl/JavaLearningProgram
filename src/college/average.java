package college;
import java.util.Scanner;
public class average {
   
    public static void main(String[]args){
        int i,num,sum=0;
        float ave;
        Scanner input=new Scanner(System.in);
        System.out.println("How many numbers do you want to enter: ");
        num=input.nextInt();
        int a[]=new int[num];
        System.out.println("Enter " +num+ " numbers");
        for(i=0;i<num;i++)
            a[i]=input.nextInt();
        for(i=0;i<=num-1;i++){
        sum=a[i]+sum;    
        }
        System.out.println("your sum is: "+sum);
        ave=sum/num;
        System.out.println("Required average of numbers is: "+ave);
        
    }
}
