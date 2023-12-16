package com.bridgelabs.client;

import java.util.Scanner;

import com.bridgelabs.concretefactory.AbstractFactory;
import com.bridgelabs.factorygenerator.SuperFactory;
import com.bridgelabs.product_2_factory.Loan;
import com.bridgelabs.product_one_fcatory.Bank;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Bank name
		System.out.print("Enter Bank name: HDFC/ICICI/SBI:  ");
		String bankname = sc.next();

		// Loan type
		System.out.print("Enter Loan type- Business/Education/Home: ");
		String loantype = sc.next();

		// Generate Bank Factory
		AbstractFactory BankFactory = SuperFactory.getFactory("Bank");

		// Generate Bank
		Bank b = BankFactory.getBank(bankname);

		// Rate
		System.out.print("Enter the interest rate for " + b.getBankName() + ": ");
		double rate = sc.nextDouble();
		// year
		System.out.print("Enter the number of years to pay your entire loan amount: ");
		int years = sc.nextInt();
		System.out.print("Enter the loan amount you want to take: ");
		// Loan Amount
		double loanAmount = sc.nextDouble();
		System.out.println("you are taking the loan from " + b.getBankName());

		// Generate Loan Factory
		AbstractFactory LoanFactory = SuperFactory.getFactory("Loan");

		// Generate Loan
		Loan l = LoanFactory.getLoan(loantype);

		// Calculate Loan Payment
		l.getInterestRate(rate);

		// Calculate EMI
		l.calculateLoanPayment(loanAmount, years);

	}

}
