package com.sj.empmanagmentapplication;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeService {
	
	HashSet<Employee> empset=new HashSet<Employee>();


	Employee emp1=new Employee(101, "Sanjida", 24, "Developer", "IT", 25000);
	Employee emp2=new Employee(102, "Sumaiya", 26, "Tester","CO", 57000);
	Employee emp3=new Employee(103, "Abdullah", 20, "Software Engineer","Admin", 5000);
	Employee emp4=new Employee(104, "Muksitul", 27, "System Engineer","CO",  70000);
	Employee emp5=new Employee(105, "Sharif", 30, "Senior Executive","IT",  100000);
	Employee emp6=new Employee(106, "Muntahina", 28, "Account Executive", "Accounts", 55000);
	Employee emp7=new Employee(107, "Tanmoy", 34, "Project Manager","IT", 75000);
	Employee emp8=new Employee(108, "Mallika", 24, "Web Designer","IT", 75000);
	Employee emp9=new Employee(109, "Jubair", 28, "Researcher","IT",  70000);
	Employee emp10=new Employee(110, "Sharif", 30, "Senior Executive","IT",  100000);

	Scanner sc=new Scanner(System.in);
	boolean found=false;
	int id;
	String name;
	int age;
	String department;
	String designation;
	double sal;

	public EmployeeService() {

		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		empset.add(emp5);
		empset.add(emp6);
		empset.add(emp7);
		empset.add(emp8);
		empset.add(emp9);
		empset.add(emp10);

	}
	public void viewAllEmps() {
		for(Employee emp:empset) {
			System.out.println(emp);
		}
	}
	public void viewEmp(){
		
		System.out.println("Enter id: ");
		id=sc.nextInt();
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println(emp);
				found=true;
			}
			
		}
		if(!found) {
			System.out.println("Employee with this id is not present");
		}
	}
	public void updateEmployee() {
		System.out.println("Enter id: ");
		id=sc.nextInt();
		boolean found=false;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println("Enter name:");
				name=sc.next();
				System.out.println("Enter new designation:");
				designation=sc.next();
				System.out.println("Enter new department:");
				department=sc.next();
				System.out.println("Enter new salary:");
				sal=sc.nextDouble();
				emp.setName(name);
				emp.setDesignation(designation);
				emp.setDepartment(department);
				emp.setSalary(sal);
				System.out.println("Updated details of employee are: ");
				System.out.println(emp);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			System.out.println("Employee details updated successfully!!");
		}
	}
	public void deleteEmp() {
		System.out.println("Enter id");
		id=sc.nextInt();
		boolean found=false;
		Employee empdelete=null;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				empdelete=emp;
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			empset.remove(empdelete);
			System.out.println("Employee deleted successfully!!");
		}
	}
	public void addEmp() {
		System.out.println("Enter id:");
		id=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter designation");
		designation=sc.next();
		System.out.println("Enter department");
		department=sc.next();
		System.out.println("Enter salary");
		sal=sc.nextDouble();
		
		Employee emp=new Employee(id, name, age, designation, department, sal);
		
		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employee added successfully!!");
		
	}
	
	}

