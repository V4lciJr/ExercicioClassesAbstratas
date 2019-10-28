package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Person;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner tec = new Scanner(System.in);
			
			List<Person> personList = new ArrayList<>();
			
			System.out.print("Enter the number of tax payers: ");
			int n = tec.nextInt();
			
			for(int i = 1 ; i <= n; i++)
			{
				System.out.println("Tax payer #" + i + " data:");
				System.out.print("Individual or company (i/c)? ");
				char response = tec.next().charAt(0);
				System.out.print("Name: ");
				tec.nextLine();
				String name = tec.nextLine();
				System.out.print("Anual income: ");
				Double annualInconme = tec.nextDouble();
				
				if(response == 'i')
				{
					System.out.print("Health expenditures: ");
					double healthSpending = tec.nextDouble();
					personList.add(new PhysicalPerson(name, annualInconme, healthSpending));
				}
				else
				{
					System.out.print("Number of employees: ");
					int employeeNumber = tec.nextInt();
					personList.add(new Company(name, annualInconme, employeeNumber));
				}
			}
			
			System.out.println();
			System.out.println("TAXES PAID:");
			
			double sum = 0.0;
			for(Person p : personList)
			{
				System.out.println(p);
				sum += p.tax();
			}
			
			System.out.println();
			System.out.printf("TOTAL TAXES: $ %.2f%n", sum);
			tec.close();

	}

}
