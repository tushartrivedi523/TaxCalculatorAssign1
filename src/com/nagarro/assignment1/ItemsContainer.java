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
* Description: This code collects all the variables required for no clash occurrence.
*/
package com.nagarro.assignment1;

/**
 * Collections of all the variables.
 * @author tushartrivedi
 * */
public class ItemsContainer {

	String name;
	String type; 
	double price;
	int quantity;
	
	double taxCostValue=0.0;                
	double finalCostItem=0.0;
	
	
	public String getName() {
		return name;
	}

	/**
	*set field name to @param name
	*/
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	/**
	*set field name to @param type
	*/
	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	/**
	*set field name to @param price
	*/
	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	/**
	*set field name to @param quantity
	*/
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTaxCostValue() {
		return taxCostValue;
	}
	
	/**
	*set field name to @param taxCostValue
	*/
	public void setTaxCostValue(double taxCostValue) {
		this.taxCostValue = taxCostValue;
	}
	public double getFinalCostItem() {
		return finalCostItem;
	}
	
	/**
	*set field name to @param finalCostItem
	*/
	public void setFinalCostItem(double finalCostItem) {
		this.finalCostItem = finalCostItem;
	}

	
}
