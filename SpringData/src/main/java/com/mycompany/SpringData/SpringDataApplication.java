package com.mycompany.SpringData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mycompany.SpringData.entity.Employee;
import com.mycompany.SpringData.service.EmployeeService;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner{
	
	@Autowired
    EmployeeService  employeeService;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        
		System.out.println("Enter operation code:\n1.Get all employee.\n2. Get Employee By id.\n3.Add employee.");
        Scanner scanner=new Scanner(System.in);
        int code=scanner.nextInt();
        switch(code) {
        
        case 1:
            List<Employee>list=employeeService.getAllEmployee();
            System.out.println(list);
        
        case 2:
           System.out.println("enter empoloyee id:");
           Integer id=scanner.nextInt();
           System.out.println(employeeService.getEmployeeById(id));
           break;
           
        case 3:
            System.out.println("Enter employee id");
            Integer eid=scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter employee name");
            String ename=scanner.nextLine();
            System.out.println("Enter employee salary");
            Double esalary=scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter employee designation");
            String edesignation=scanner.nextLine();
            System.out.println("Enter employee doj");
            LocalDate edoj=LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            Employee emp=new Employee(eid, ename, esalary, edesignation, edoj);
            System.out.println(employeeService.addEmployee(emp));
            break;
        case 4:
            break;
        case 5:
            break;
        case 6:
            System.out.println("");
            
        }
        scanner.close();
    }

}
