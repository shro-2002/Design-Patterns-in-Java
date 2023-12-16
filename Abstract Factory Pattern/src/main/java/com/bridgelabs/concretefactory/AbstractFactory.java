package com.bridgelabs.concretefactory;

import com.bridgelabs.product_2_factory.Loan;
import com.bridgelabs.product_one_fcatory.Bank;

/*
 * @Description: This is the abstract factory class which is responsible for generating the concrete factories of the bank and loan
 * 
 * @Behaviour: getBank() ,getLoan()
 * 
 */
public abstract class AbstractFactory {

	/*
	 * @Description: Responsible for generating Bank object
	 * 
	 * @param: String
	 * 
	 * @return: Bank
	 */
	public abstract Bank getBank(String bank);

	/*
	 * @Description: Responsible for generating Loan object
	 * 
	 * @param: String
	 * 
	 * @return: Loan
	 */
	public abstract Loan getLoan(String loan);

}
