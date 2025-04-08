import java.util.Scanner;
interface prop
{
    void getdata();
    void area();
    void perimeter();
}
class Circle implements prop{
    double pi=3.14;
    double r;
    Scanner sc=new Scanner(System.in);
    public void getdata()
    {
        System.out.println("enter the radius of the circle");
        r=sc.nextDouble();
    }
    public void perimeter()
    {
         System.out.println("perimeter of the circle"+(2*pi*r));
    }
    public void area()
    {
         System.out.println("area of the circle"+(pi*r*r));
    }
    
}
class Rectangle implements prop{

    double l,b;
    Scanner sc=new Scanner(System.in);
    public void getdata()
    {
        System.out.println("enter the length of the rectangle");
        l=sc.nextDouble(); 
         System.out.println("enter the breadth of the rectangle");
        b=sc.nextDouble();

    }
    public void perimeter()
    {
         System.out.println("perimeter of the circle"+(2*(l+b)));
    }
    public void area()
    {
         System.out.println("area of the circle"+(l*b));
    }
    
}
public class prototype
{
    public static void main(String[] args)
    {
        int ch;
        Scanner sc=new Scanner(System.in);
        Circle ob=new Circle();
        Rectangle obj=new Rectangle();
        do
        {
            System.out.println("\n 1.Circle \n 2.Rectangle \n 3. Exit");
            System.out.println("Enter your choice");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:ob.getdata();
                        ob.area();
                        ob.perimeter();
                        break;
            
                case 2:obj.getdata();
                        obj.area();
                        obj.perimeter();
                        break;
                case 3:System.out.println("exited.....");
                        System.exit(0);


            }
        }while(true);
    }
}