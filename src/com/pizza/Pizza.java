package com.pizza;

public class Pizza {
	
	private String codePizza;
	private String designation;
	private double prix;
	
	public Pizza(String code, String designation, double prix) {
		this.codePizza = code;
		this.designation = designation;
		this.prix = prix;
	}

	public String getCode() {
		return codePizza;
	}
	
	public void setCodePizza(String codePizza) {
		this.codePizza = codePizza;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public double getPrix() {
		return prix;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	@Override
	public String toString() {
		String result = "Code : " + codePizza + "\r\n";
		result += "Désignation : " + designation + "\r\n";
		result += "Prix : " + prix + "€";
		
		return result;
	}
}
