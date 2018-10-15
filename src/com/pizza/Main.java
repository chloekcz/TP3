package com.pizza;

import com.pizza.*;

public class Main {

	public static void main(String[] args) {

		PizzaMemDao dao = new PizzaMemDao();

		Pizza[] listPizza = dao.findAllPizzas();
		
		for (int i = 0; i < listPizza.length; i++) {
			System.out.println(listPizza[i]);
		}
		
		System.out.println("\n" + dao.findPizzaByCode("Mar"));
		
		System.out.println("\n" + dao.isPizzaExists("ZER"));
		
		Pizza Chevre = new Pizza("CHE", "chevre", 18);
		dao.updatePizza("CHE", Chevre);
		System.out.println("\n" + Chevre);
	}

}