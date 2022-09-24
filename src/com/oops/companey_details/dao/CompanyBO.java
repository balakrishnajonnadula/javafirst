package com.oops.companey_details.dao;

import java.util.Scanner;

import com.oops.companey_details.dto.Address;
import com.oops.companey_details.dto.Company;

public class CompanyBO {
	Scanner scanner = new Scanner(System.in);
	Company[] company = null;

	public Company[] companyData() {
		System.out.println("Enter the number of Companies..!");
		int size = scanner.nextInt();
		company = new Company[size];
		scanner.nextLine();
		for (int i = 0; i <= company.length - 1; i++) {
			System.out.println("Enter the Companey " + (i + 1) + " details.");
			System.out.println("Enter the Companey id : ");
			String identifier = scanner.nextLine();
			System.out.println("Enter the company's IATA code : ");
			String iata = scanner.nextLine();
			System.out.println("Enter the company's FMC code : ");
			String fmc = scanner.nextLine();
			System.out.println("Enter the company's state : ");
			String state = scanner.nextLine();
			System.out.println("Enter the company's country : ");
			String country = scanner.nextLine();
			company[i] = new Company(identifier, iata, fmc, new Address(state, country));
		}
		return company;
	}

	public void displayCompanyDetails() {
		companyData();
		if (company != null) {
			System.out.println("Companies out side india :");
			System.out.println("Company ID \t IATA Code \t FMC Code \t State \t\t Country");
			for (Company com : company) {
				if (com.getAddress().getCountry().equals("india")) {
					System.out.println(com.getIdentifier() + "\t\t" + com.getIata() + "\t\t" + com.getFmc() + "\t\t"
							+ com.getAddress().getState() + "\t\t" + com.getAddress().getCountry());
				}
			}
		} else {
			System.out.println("Source not found..!");
		}

	}

}
