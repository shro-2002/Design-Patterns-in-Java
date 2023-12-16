package com.bridgelabs.product_one_fcatory;

/*
 * @Description: This is the abstract factory class which is responsible for creating the concrete factory classes
 * 
 * @Behaviour: getBankName() 
 * 
 */
public interface Bank {

	/*
	 * @Description: This is the abstract method which is implemented by the
	 * concrete factory classes
	 * 
	 * @param: Void
	 * 
	 * @return: String
	 */

	String getBankName();

}
