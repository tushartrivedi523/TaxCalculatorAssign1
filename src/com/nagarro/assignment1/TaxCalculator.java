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
* Last updated By: Tushar Trivedi
*
* Last updated Date: 09-04-2021
*
* Description: This code mainly calculates the price of items after all tax inclusion.
*/

package com.nagarro.assignment1;

public class TaxCalculator {
	
	/**
	 * findTax method-> used to calculate,
	 * tax generated my item
	 * */
	public static double findTax(ItemsContainer item)
	{
		
		double taxCost=0.0;
		
		if(item.getType().equals("Raw")||item.getType().equals("raw"))
		{
			taxCost+=item.price*0.125;
		}
		
		else if(item.getType().equals("Manufactured")||item.getType().equals("manufactured"))
		{
			taxCost+=item.price*0.125;
			taxCost+=0.02*(item.price+taxCost);	
		}
		
		else
		{
			double tempFinalCost=0;
			double surCharge=0;
			taxCost+=0.10*item.price;
			tempFinalCost=item.price+taxCost;
			if(tempFinalCost<=100)
			{
				surCharge=5;
			}
			
			else if(tempFinalCost>100 && tempFinalCost<=200)
			{
				surCharge=10;
			}
			
			else
			{
				surCharge=0.05*tempFinalCost;
			}
			taxCost+=surCharge;
		}
		return taxCost;
	}
	}


