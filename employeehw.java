package training2;
import java.util.Scanner;
public class employeehw {
	    int empId;
	    String empName;
	    double[] monthlySalary = new double[3];

	    void getData() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Employee ID: ");
	        empId = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Employee Name: ");
	        empName = sc.nextLine();

	        System.out.println("Enter 3 Monthly Salaries:");
	        for (int i = 0; i < 3; i++) {
	            monthlySalary[i] = sc.nextDouble();
	        }
	    }

	    void displayDetails() {
	        double total = 0;

	        for (int i = 0; i < 3; i++) {
	            total += monthlySalary[i];
	        }

	        double average = total / 3;

	        int vowels = 0;
	        String name = empName.toLowerCase();

	        for (int i = 0; i < name.length(); i++) {
	            char ch = name.charAt(i);

	            if (ch == 'a' || ch == 'e' || ch == 'i' ||
	                ch == 'o' || ch == 'u') {
	                vowels++;
	            }
	        }

	        String reverse = "";
	        for (int i = empName.length() - 1; i >= 0; i--) {
	            reverse += empName.charAt(i);
	        }

	        System.out.println("\nEmployee ID : " + empId);
	        System.out.println("Employee Name : " + empName);

	        System.out.println("\nTotal Salary : " + total);
	        System.out.println("Average Salary : " + average);

	        System.out.println("\nNumber of Vowels : " + vowels);

	        System.out.println("\nReversed Name : " + reverse);
	    }

	public static void main(String[] args) {
	        employeehw e = new employeehw();
	        e.getData();
	        e.displayDetails();

	}

}
