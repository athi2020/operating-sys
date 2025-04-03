import java.util.Scanner;

class vehicle {
    String mileage;
    int price;

    vehicle(String mil, int pri) {
        mileage = mil;
        price = pri;
    }
}

class car extends vehicle {
    String warranty;
    double ownercost;
    int seatingcapacity;
    String fuel;

    car(String mil, int pri, String w, double owner, int capa, String f) {
        super(mil, pri);
        warranty = w;
        ownercost = owner;
        seatingcapacity = capa;
        fuel = f;
    }
}

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

