package college;
import java.util.Scanner;
public class bubble_sort {
    public static void main(String []args){
        Scanner input=new Scanner(System.in); 
        int i,j,num,temp;
        System.out.println("How many numbers would you like to enter? ");
        num=input.nextInt();
        int a[]=new int[num];
        System.out.println("Enter "+num+" integers:");
        for(i=0;i<num;i++)
           a[i]=input.nextInt();
        for(i=1;i<=num;i++){
            for(j=0;j<num-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        
        System.out.println("Your sorted list of integers is: ");
        for(i=0;i<num;i++)
            System.out.println(a[i]);
    }
    
    
}
