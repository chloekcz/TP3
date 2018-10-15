package com.pizza;

import java.util.Arrays;

public class PizzaMemDao implements IPizzaDao {

	private Pizza[] listPizza = new Pizza[3];

	public PizzaMemDao() {
		Pizza pizzaMarg = new Pizza("Mar", "Margarita", 13.50);
		listPizza[0] = pizzaMarg;

		Pizza pizzaPep = new Pizza("PEP", "Pepperoni", 14);
		listPizza[1] = pizzaPep;

		Pizza pizzaRei = new Pizza("REI", "Reine", 12);
		listPizza[2] = pizzaRei;
	}

	@Override
	public Pizza[] findAllPizzas() {
		return listPizza;
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		for (int i = 0; i < listPizza.length; i++) {
			if (listPizza[i].getCode() == codePizza) {
				pizza = listPizza[i];
				break;

			}
		}
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		Pizza result = null;

		for (int i = 0; i < listPizza.length; i++) {

			if (listPizza[i].getCode().equals(codePizza)) {
				result = listPizza[i];
			}
		}
		return result;
	}

	@Override
	public boolean isPizzaExists(String codePizza) {
		if (findPizzaByCode(codePizza) == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return "PizzaMemDao [listPizza=" + Arrays.toString(listPizza) + "]";
	}

}