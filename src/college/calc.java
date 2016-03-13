package college;
public class calc {
    int a=10,b=5;
    void calculate(){
    int c=a+b,d=a-b,q=a/b,m=a*b;
    System.out.println(" sum= "+c+"\n diff= "+d +"\n product= "+m +"\n quotient= "+q);
    }
    public static void main(String[]arg){
        calc x=new calc();
    x.calculate();
    }
    
    
}
