package tester;

import java.util.Scanner;

import solution.Department;
import solution.Employee;

public class TestCredentials {

	public static void main(String[] args) {
		System.out.println("Please Enter the Department number from the Department list: ");
		System.out.println("1.Technical\n 2. Admin\n 3. Human Resource\n 4. legal");
		Scanner sc=new Scanner(System.in);
		int dept=sc.nextInt();
		Department d;
		if(dept==1)
		{
			 d=Department.valueOf("Technical");
		}
		else if(dept==2) {
			 d=Department.valueOf("Admin");
		}
		else if(dept==3) {
			 d=Department.valueOf("Human Resource");
		}
		else
		{
			 d=Department.valueOf("legal");
		}
		
		
		Employee e=new Employee("Pushpendra","pratap",d);
		System.out.println(e.toString());
		sc.close();
		
	}

}
