package com.bridgelabs.product_2_factory;

/*
 * @Description: This is the abstract product class which is responsible for creating the concrete product classes
 * 
 * @Method: getInterestRate() ,calculateLoanPayment() 
 * 
 * @Properties: rate is the variable which is used to calculate the EMI
 */
public abstract class Loan {
	protected double rate;

	/*
	 * @Description: This is the abstract method to initialize the rate of interest
	 * for different types of loans
	 * 
	 * @param: Void
	 * 
	 * @return: Void
	 */
	public abstract void getInterestRate(double rate);

	/*
	 * @Description: This is the method to calculate the EMI for different types of
	 * loans
	 * 
	 * @param: loanamount,years
	 * 
	 * @return: Void
	 */
	public void calculateLoanPayment(double loanamount, int years) {

		double EMI;
		int n;

		n = years * 12;
		rate = rate / 1200;

		EMI = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanamount;

		System.out.println("your's monthly EMI is " + EMI + " for the amount " + loanamount + " you have borrowed ");

	}

}
