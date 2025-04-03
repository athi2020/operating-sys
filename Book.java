import java.util.Scanner;

class Book{
	int accession number;
	String title;
	String author;
	String edition;
 	String publisher;

    Book(int ano,String tit, String aut,String edi,String pub) {
        accession number = ano;
        title= tit;
        author=aut;
        edition=edi;
        publisher=pub;
    }
}
 void display() {
        System.out.println("\n***** Books details *****");
        System.out.println("accession number: " + ano);
        System.out.println("title: " + tit);
        System.out.println("author: " + aut);
        System.out.println("edition: " + edi);
        System.out.println("publisher: " + pub);
       
    }
    
    
    
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Books: ");
        int n = sc.nextInt();

        Book[] arr = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for book " + (i + 1) + ":");

            System.out.print("accession number: ");
            int accession number = sc.nextInt();
            
            System.out.print("title: ");
            String title = sc.next();

            System.out.print("edition: ");
            String edition = sc.next();
            
            System.out.print("publisher: ");
            String publisher= sc.next();
            
            
             arr[i] = new Book(accession number, title, author, edition, publisher);
            
            }
    
    
    
    
    
    
    
    
Scanner sc=new scanner(system.in);

System.out.print("Enter the number of Books: ");
        int n = sc.nextInt();

        Book[] cars = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");




public class maruthi extends car {
    String modeltype;

    maruthi(String mil, int pri, String w, double owner, int capa, String f, String model) {
        super(mil, pri, w, owner, capa, f);
        modeltype = model;
    }

    void display() {
        System.out.println("\n***** vehicle details *****");
        System.out.println("mileage: " + mileage);
        System.out.println("price: " + price);
        System.out.println("\n***** car details *****");
        System.out.println("ownership cost: " + ownercost);
        System.out.println("warranty: " + warranty);
        System.out.println("seating capacity: " + seatingcapacity);
        System.out.println("fuel: " + fuel);
        System.out.println("model type: " + modeltype);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Maruthi cars: ");
        int n = sc.nextInt();

        maruthi[] cars = new maruthi[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for car " + (i + 1) + ":");

            System.out.print("mileage: ");
            String mileage = sc.next();
            
            System.out.print("price: ");
            int price = sc.nextInt();

            System.out.print("warranty: ");
            String warranty = sc.next();
            
            System.out.print("ownership cost: ");
            double ownercost = sc.nextDouble();
            
            System.out.print("seating capacity: ");
            int seatingcapacity = sc.nextInt();
            
            System.out.print("fuel type: ");
            String fuel = sc.next();
            
            System.out.print("model type: ");
            String modeltype = sc.next();

            cars[i] = new maruthi(mileage, price, warranty, ownercost, seatingcapacity, fuel, modeltype);
        }

        System.out.println("\n***** Displaying Details of All Cars *****");
        for (int i = 0; i < n; i++) {
            System.out.println("\nCar " + (i + 1) + " Details:");
            cars[i].display();
        }

        sc.close();
    }
}

