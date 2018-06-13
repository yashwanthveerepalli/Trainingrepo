package com.java.barista;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


// This class holds the prototypes of the ingredients and the current quantity of each of them
public class Inventory {

	 Map<String, Integer> quantities;
	 Map<String, Ingredient> ingredients;

	public Inventory() {
		ingredients = new HashMap<String, Ingredient>();
		quantities = new TreeMap<String, Integer>();
		loadIngredient(new DecafCoffee());
		loadIngredient(new Sugar());
		loadIngredient(new Cream());
		loadIngredient(new Cocoa());
		loadIngredient(new Espresso());
		loadIngredient(new FoamedMilk());
		loadIngredient(new SteamedMilk());
		loadIngredient(new WhippedCream());
		loadIngredient(new Coffee());
	}

	public void display() {
		System.out.println("Inventory:");
		Iterator<String> it1 = quantities.keySet().iterator();
		Iterator<Integer> it2 = quantities.values().iterator();
		while (it1.hasNext() && it2.hasNext()) {
			System.out.println(it1.next() + "," + it2.next());
		}
	}

	public void restock() {
		for (String ingredient : quantities.keySet()) {
			quantities.put(ingredient, 10);
		}
	}

	// We can add more ingredients once the inventory has been created
	public void loadIngredient(Ingredient ingredient) {
		if (ingredients.containsKey(ingredient.getName())) {
			throw new RuntimeException();
		}
		else {
			ingredients.put(ingredient.getName(), ingredient);
			quantities.put(ingredient.getName(), 10);
		}
	}

	// Checks if there is the specified amount of ingredients in the inventory
	public boolean enoughOf(String ingredient, int qty) {
		if (ingredients.containsKey(ingredient)) {
			if (quantities.get(ingredient) >= qty) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			throw new RuntimeException(ingredient);
		}
	}

	// Returns the specified ingredient and decreases its quantity in the inventory
	public Ingredient get(String ingredient) {
		if (enoughOf(ingredient, 1)) {
			quantities.put(ingredient, quantities.get(ingredient) - 1);
			return ingredients.get(ingredient).clone();
		}
		else {
			throw new RuntimeException();
		}
	}

	// Returns the cost of an ingredient in cents ($1.00 = 100)
	public int getCost(String ingredient) {
		if (ingredients.containsKey(ingredient)) {
			return ingredients.get(ingredient).cost();
		}
		else {
			throw new RuntimeException();
		}
	}

}
