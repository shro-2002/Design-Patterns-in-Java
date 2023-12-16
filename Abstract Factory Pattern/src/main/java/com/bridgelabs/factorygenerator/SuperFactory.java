package com.bridgelabs.factorygenerator;

import com.bridgelabs.concretefactory.AbstractFactory;
import com.bridgelabs.concretefactory.BankFactory;
import com.bridgelabs.concretefactory.LoanFactory;

/*
 * @Description: This is the concrete factory class which is responsible for generating loan and bank factory objects
 * 
 * @Behaviour: getBank() ,getLoan()
 * 
 */
public class SuperFactory {

	/*
	 * @Description: Responsible for generating Bank and Loan factory objects
	 * 
	 * @param: String
	 * 
	 * @return: AbstractFactory
	 */
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("Bank"))
			return new BankFactory();
		else if (choice.equalsIgnoreCase("Loan"))
			return new LoanFactory();

		return null;
	}

}
