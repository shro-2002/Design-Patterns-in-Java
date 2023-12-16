package com.bridgelabs.product_one_fcatory;

/*
 * @Description: This is the concrete factory class which implements the abstract factory class Bank
 * 
 * @Behaviour: getBankName() ,Parameterized constructor
 * 
 * @Properties :BNAME is the final variable which denotes the name of the bank
 */
public class HDFC implements Bank {
	private final String BNAME;

	/*
	 * @Description: Parameterized constructor: initialize Bank name
	 * 
	 * @param: Void
	 * 
	 * @return: Void
	 */
	public HDFC() {
		BNAME = "HDFC BANK";
	}

	/*
	 * @Description: Returns the bank name
	 * 
	 * @param: Void
	 * 
	 * @return: String
	 */
	@Override
	public String getBankName() {
		return BNAME;
	}

}
