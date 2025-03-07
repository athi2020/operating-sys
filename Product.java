public class product
{
    int pcode;
    String pname;
    double price;
    double lowest;
    void data(int c,String n,double p)
    {
        pcode=c;
        pname=n;
        price=p;
    }
    void display()
    {
        System.out.println(pcode+"\t\t"+pname+"\t\t"+price);

    }
    static void findlowest(double price1,double price2,double price3)
     {
        if(price1<=price2 && price1<=price3)
            System.out.println("\n product 1 has lowest price");
        else if(price2<=price1 && price2<=price3)
            System.out.println("\n product 2 has lowest price");
        else
            System.out.println("\n product 3 has lowest price");
     
     }

public static void main(String[] args){
    product obj1=new product();
    product obj2=new product();
    product obj3=new product();
    obj1.data(101,"product1",100.0);
    obj2.data(102,"product2",128.0);
    obj3.data(103,"product3",198.0);
    System.out.println("product information");
    obj1.display();
    obj2.display();
    obj3.display();
    findlowest(obj1.price,obj2.price,obj3.price);


}
}