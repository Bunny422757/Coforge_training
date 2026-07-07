package com.coforge.ems.ui;

import java.util.Scanner;

import com.coforge.ems.controller.EmployeeController;
import com.coforge.ems.model.Employee;

public class EmployeeApp {

	private static  EmployeeController controller = new EmployeeController();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String confirmation = " ", result = "";
		do {
			System.out.println("1.Create 2.Update 3.Delete 4.Find 5.Find All 6.Quit");
			System.out.println("Enter your Choice");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter employee Id, name, Salary and Dno");
				Employee employee = new Employee(scanner.nextInt(), scanner.next(), scanner.nextInt(),
						scanner.nextInt());
				result = controller.createEmployee(employee);
				System.out.println(result);
				break;
			case 2:
				System.out.println("Enter Employee Id, New Name, New Salary and New Dno");
			    employee = new Employee(scanner.nextInt(), scanner.next(), scanner.nextInt(),
			            scanner.nextInt());
			    result = controller.updateEmployee(employee);
			    System.out.println(result);
				break;
			case 3:
				System.out.println("Enter Employee Id to Delete");
			    int eid = scanner.nextInt();
			    result = controller.deleteEmployee(eid);
			    System.out.println(result);
				break;
			case 4:
				System.out.println("Enter Employee ID to find His/her Details");
				eid = scanner.nextInt();
				result = controller.findEmployee(eid);
				System.out.println(result);
				break;
			case 5:
				result = controller.findAllEmployee();
				System.out.println(result);
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}

			System.out.println("Do you wnat to continue {Yes | No} ");
			confirmation = scanner.next();
		} while (confirmation.equalsIgnoreCase("Yes"));

	}

}
