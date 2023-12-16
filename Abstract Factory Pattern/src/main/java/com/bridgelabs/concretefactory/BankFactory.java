package com.bridgelabs.concretefactory;

import com.bridgelabs.product_2_factory.Loan;
import com.bridgelabs.product_one_fcatory.Bank;
import com.bridgelabs.product_one_fcatory.HDFC;
import com.bridgelabs.product_one_fcatory.ICICI;
import com.bridgelabs.product_one_fcatory.SBI;

/*
 * @Description: This is the concrete factory class which is responsible for generating the objects of Bank type 
 * @Behaviour: getBank() ,getLoan()
 * 
 */
public class BankFactory extends AbstractFactory {

	/*
	 * @Description: Responsible for generating Bank object
	 * 
	 * @param: String
	 * 
	 * @return: Bank
	 */
	@Override
	public Bank getBank(String bank) {

		if (bank.equalsIgnoreCase("HDFC"))
			return new HDFC();
		else if (bank.equalsIgnoreCase("ICICI"))
			return new ICICI();
		else if (bank.equalsIgnoreCase("SBI"))
			return new SBI();

		return null;
	}

	/*
	 * @Description: Responsible for generating Loan object
	 * 
	 * @param: String
	 * 
	 * @return: Null
	 */
	@Override
	public Loan getLoan(String loan) {

		return null;
	}

}
