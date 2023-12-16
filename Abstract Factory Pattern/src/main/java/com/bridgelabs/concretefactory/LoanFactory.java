package com.bridgelabs.concretefactory;

import com.bridgelabs.product_2_factory.BusinessLoan;
import com.bridgelabs.product_2_factory.EducationLoan;
import com.bridgelabs.product_2_factory.HomeLoan;
import com.bridgelabs.product_2_factory.Loan;
import com.bridgelabs.product_one_fcatory.Bank;

/*
 * @Description: This is the concrete factory class which is responsible for generating the objects of Loan type 
 * @Behaviour: getBank() ,getLoan()
 * 
 */
public class LoanFactory extends AbstractFactory {

	/*
	 * @Description: Responsible for generating Bank object
	 * 
	 * @param: String
	 * 
	 * @return: Null
	 */
	@Override
	public Bank getBank(String bank) {
		return null;
	}

	/*
	 * @Description: Responsible for generating Loan object
	 * 
	 * @param: String
	 * 
	 * @return: Loan
	 */
	@Override
	public Loan getLoan(String loan) {

		if (loan.equalsIgnoreCase("Home"))
			return new HomeLoan();
		if (loan.equalsIgnoreCase("Education"))
			return new EducationLoan();
		if (loan.equalsIgnoreCase("Business"))
			return new BusinessLoan();

		return null;
	}

}
