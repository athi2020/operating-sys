import java.util.Scanner;
class sports{
	String sport;
	int Rating;
	sports(String spo,int ra){
		sport=spo;
		Rating=ra;
	}
}
class student extends sports{
	String Grade;
	double Overall_per;
	student(String spo,int ra,String gd,double per){
		super(spo,ra);
		Grade=gd;
		Overall_per=per;
	}
}
public class result extends student{
	result(String spo,int ra,String gd,double per){
		super(spo,ra,gd,per);
	}
	void display(){
		System.out.println("\nSports details of student");
		System.out.println("Sport:"+sport);
		System.out.println("Rating:"+Rating);
		System.out.println("\nAcademic details of student");
		System.out.println("Academic Grade:"+Grade);
		System.out.println("overall percentage:"+Overall_per);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of students: ");
        int n= sc.nextInt();
        result[] arr = new result[n];
        for(int i=0;i<n;i++){

		System.out.println("\nEnter the sports details of student");
		System.out.println("\nSport:");
		String a=sc.next();
		System.out.println("\nSport Rating out of 10:");
		int b=sc.nextInt();
		System.out.println("\nenter the academic details of student");
		System.out.println("\nAcademic Grade:");
		String c=sc.next();
		System.out.println("\nOverall percentage:");
		double d=sc.nextDouble();
		arr[i]=new result(a,b,c,d);
		}
		System.out.println("\nDisplaying details of all students:");
        for (int i = 0; i < n; i++) {
            arr[i].display();  
        }

	
		sc.close();
		
	}
}		
