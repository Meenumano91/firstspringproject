package com.Acciojob.firstproject;

import com.Acciojob.firstproject.model.Address;
import com.Acciojob.firstproject.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstprojectApplication.class, args);
		System.out.println("Welcome to our First Spring Application");
/*
        //tight coupling
		Employee emp1=new Employee();
		emp1.id=1;
		emp1.name="Murugan";
		emp1.email="abc@gmail.com";
		emp1.destination="Developer";

		Address adrs1=new Address();

		adrs1.doorno=333;
		adrs1.streetname="sm nagar";
		adrs1.city="Madurai";

		emp1.address=adrs1;

		System.out.println("emp1 is : " + emp1);
		System.out.println("Address1 is "+ adrs1);

		adrs1.streetname="new street";
		adrs1.city="new city";

		System.out.println("emp1 after change is : " + emp1);
		System.out.println("Address1 after change is "+ adrs1);
*/

		//Loose Coupling
		Employee emp1=new Employee();
		emp1.setId(2);
		emp1.setName("Maghi");
		emp1.setEmail("123@gmail.com");
		emp1.setDesignation("Dev");

		Address adrs1=new Address();
		adrs1.setDoorno(12);
		adrs1.setStreetname("old Street");
		adrs1.setCity("old city");

		emp1.setAddress(adrs1);

		System.out.println("emp1 is : "+emp1);
		System.out.println("Address1 is : "+adrs1);

		//Changing address with emp1 object
		emp1.getAddress().setStreetname("new street");
		emp1.getAddress().setCity("new city");

		System.out.println("emp1 after change is : "+emp1);
		System.out.println("Address1 after change  is : "+adrs1);


		//Constructor Injection
		Address adrs2 = new Address(123,"O street","O city");
		Employee emp2 = new Employee(3,"Manoj Saran","mano@gmail.com","Developer",adrs2);

		System.out.println("Emp2 is : "+emp2);
		System.out.println("Address2 is : "+adrs2);

		emp2.getAddress().setCity("N city");
		emp2.getAddress().setStreetname("N street");

		System.out.println("Emp2 after change is "+ emp2);
		System.out.println("Address2 after change is "+adrs2);

	}

}
