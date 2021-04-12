/*
* Class name: findCostAfterTax
*
* Version info
*
* Copyright notice
* 
* Author info: TusharTrivedi
*
* Creation date: 08-04-2021
*
* Last updated By
*
* Last updated Date
*
* Description: This code mainly calculates the price of items after all tax inclusion.
*/

package com.nagarro.assignment1;

public class FindFinalCost {
	
	/**
	 * FindFinalCost method-> The below method
	 * calculates the final cost of the item.
	 * */
	public static double findFinalCost(ItemsContainer item, double taxCostValue)
	{
		return item.quantity*(item.getPrice()+taxCostValue);
	}
}
