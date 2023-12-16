
package com.bridgelabs.product_2_factory;

/*
 * @Description: This is the concrete product class which implements the abstract product class Loan
 * 
 * @Behaviour: getInterestRate() 
 * 
 * @Properties: rate is the variable which is used to calculate the EMI
 */
public class HomeLoan extends Loan {

	/*
	 * @Description: initializes the rate of interest for the home loan
	 * 
	 * @param: Void
	 * 
	 * @return: Void
	 */
	@Override
	public void getInterestRate(double r) {

		rate = r;

	}

}
