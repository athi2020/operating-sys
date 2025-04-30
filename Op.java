package Graphics;
import java.util.Scanner;
interface operation{
    void add();
    void sub();
    void mul();
    void div();

}
public class Op implements operation{
    Scanner s=new Scanner(System.in);
    public void add()
    {
        System.out.println("enter the n1");
        int n1=s.nextInt();
        System.out.println("enter the n2");
        int n2=s.nextInt();
        System.out.println("Addition:"+(n1+n2));
    }
     public void sub()
    {
        System.out.println("enter the n1");
        int n1=s.nextInt();
        System.out.println("enter the n2");
        int n2=s.nextInt();
        System.out.println("substration:"+(n1-n2));
    }
     public void mul()
    {
        System.out.println("enter the n1");
        int n1=s.nextInt();
        System.out.println("enter the n2");
        int n2=s.nextInt();
        
        System.out.println("Multipication:"+(n1*n2));
    }
     public void div()
    {
        System.out.println("enter the n1");
        int n1=s.nextInt();
        System.out.println("enter the n2");
        int n2=s.nextInt();
        
        System.out.println("Area of the circle:"+(n1/n2));
    }
    
}