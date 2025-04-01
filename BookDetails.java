import java.util.Scanner;

class Publisher {
    String publisher;

    Publisher(String pub) {
        this.publisher = pub;
    }
}

class Book extends Publisher {
    String book;

    Book(String pub, String boo) {
        super(pub);
        this.book = boo;
    }
}

class Literature extends Book {
    String category;

    Literature(String pub, String boo) {
        super(pub, boo);
    }

    void display() {
        System.out.println("Publisher: " + publisher);
        System.out.println("Book: " + book);
    }
}

class Fiction extends Book {
    String category;

    Fiction(String pub, String boo) {
        super(pub, boo);
    }

    void display() {
        System.out.println("Publisher: " + publisher);
        System.out.println("Book: " + book);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\nEnter the number of literature books:");
        int num = sc1.nextInt();

        Literature[] arr = new Literature[num];
        System.out.println("\nEnter the literature book details:");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num; i++) {
            System.out.println("\n" + (i + 1) + ")");
            System.out.print("\nBook: ");
            String boo = sc.next();
            System.out.print("\nPublisher: ");
            String pub = sc.next();
            arr[i] = new Literature(pub, boo);
        }

        System.out.println("\nEnter the number of fiction books:");
        int num1 = sc1.nextInt();
        Fiction[] arr1 = new Fiction[num1];
        System.out.println("\nEnter the fiction book details:");

        for (int i = 0; i < num1; i++) {
            System.out.println("\n" + (i + 1) + ")");
            System.out.print("\nBook: ");
            String boo = sc.next();
            System.out.print("\nPublisher: ");
            String pub = sc.next();
            arr1[i] = new Fiction(pub, boo);
        }

        sc.close();
        sc1.close();

        System.out.println("\n************* Information of all the literature books *******");
        for (int i = 0; i < num; i++) {
            System.out.println("\n" + (i + 1) + ").");
            arr[i].display();
        }

        System.out.println("\n************* Information of all the fiction books *******");
        for (int i = 0; i < num1; i++) {
            System.out.println("\n" + (i + 1) + ").");
            arr1[i].display();
        }
    }
}
