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
* Last updated Date: 12-04-2021
*
* Description: This code mainly calculates the price of items after all tax inclusion.
*/

package com.nagarro.assignment1;
import java.util.*;

/**
 * Main Class
 * @author tushartrivedi
 *
 */
public class Main {
	
	/**
	 * Main Method
	 * */
	public static void main(String[] args) {
		char userChoice='\0';
		
		do {
			
		Scanner input = new Scanner(System.in);
		String itemName="";           
		String itemType="";		       
		double itemPrice=0.0;              
		int itemQuantity=0;    
		int flagForWrongInputFormat=0;
			
		String inputFromUser = "";
		inputFromUser=input.nextLine();                                  //Getting Console Input from User
		
		String[] diffInput = inputFromUser.split(" ");
		int length=diffInput.length;
		
		if(diffInput[0].equals("-name"))                                 //Checking if first input is -name than implement below code
		{
			/*
		     * Below loop is fetching the details,
		     * which is entered by the user from console
		     * */
			for(int i=0;i<length-1;i=i+2)                  
			{
				if(diffInput[i].equals("-name"))
					{
						itemName=diffInput[i+1];
					}
				else if(diffInput[i].equals("-price"))
					{
						try 											  //Exception check for Price Tag
						{
							itemPrice=Double.parseDouble(diffInput[i+1]);
						}
						catch(Exception e)
						{
							System.err.println("Price Should be Double");
							flagForWrongInputFormat=1;
						}
					}
				else if(diffInput[i].equals("-type"))
					{
						itemType=diffInput[i+1];
					}
				else if(diffInput[i].equals("-quantity"))				//Exception check for Quantity Tag
					{
						try 
						{
							itemQuantity=Integer.parseInt(diffInput[i+1]);
						}
						catch(Exception e)
						{
							System.err.println("Quantity Should be an Integer");
							flagForWrongInputFormat=1;
						}
					}		
				else													//If input not in correct format than below code implemented			
					{
						System.err.println("Please enter in correct order");
						flagForWrongInputFormat=1;
						break;
					}
			}
				
			if(flagForWrongInputFormat==0)							  //If all the above checks are correct than proceed to calculation
			{
				double taxCostValue=0.0;                
				double finalCostItem=0.0;
				/*
				 * Below Code is mainly,
				 * putting all the variables name
				 * in a class so that their is, no clash.
				 * */
				ItemsContainer item = new ItemsContainer();
				item.setName(itemName);
				item.setPrice(itemPrice);
				item.setQuantity(itemQuantity);
				item.setType(itemType);
						
				taxCostValue=TaxCalculator.findTax(item);                       //Method for tax calculation   
				finalCostItem=FindFinalCost.findFinalCost(item, taxCostValue);  //Method for final price calculation
					
				System.out.println(String.format("%s %.2f %.2f %.2f", itemName,itemPrice,taxCostValue,finalCostItem));   //Display Output
			}
				
				
		}
		else				  //If First input is not -name then below code is implemented 
		{
			System.err.println("Please Enter -name first!!");
		}
		
		System.out.println("Do you want to enter details of any other item (y/n):");
		userChoice=input.next().charAt(0);                            //Asking user weather he/she wants to enter more?
		}while(userChoice=='y'||userChoice=='Y');
	}
}
