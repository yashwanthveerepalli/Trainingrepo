package com.java.barista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaristaMaticMachine {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		Menu menu = new Menu(inventory);
		inventory.display();
		menu.display();
		boolean quit = false;
		while (!quit) {
			BufferedReader dataIn = new BufferedReader(new InputStreamReader(
					System.in));
			String line = "";
			while (line.equals("")) {
				try {
					line = dataIn.readLine();
				} catch (IOException e) {
					throw new RuntimeException();
				}
			}
			char c = (line.length() > 1) ? 0 : line.toLowerCase().charAt(0);
			switch (c) {
			// restock and redisplay inventory and menu
			case 'r':
				inventory.restock();
				inventory.display();
				menu.display();
				break;
				// quit application
			case 'q':
				quit = true;
				break;
				//Caffe Americano
			case '1':
				menu.makeDrink(0);
				inventory.display();
				menu.display();
				break;
				//Caffe Latte
			case '2':
				menu.makeDrink(1);
				inventory.display();
				menu.display();
				break;
				//Caffe Mocha
			case '3':
				menu.makeDrink(2);
				inventory.display();
				menu.display();
				break;
				//Cappuccino
			case '4':
				menu.makeDrink(3);
				inventory.display();
				menu.display();
				break;
				//Coffee
			case '5':
				menu.makeDrink(4);
				inventory.display();
				menu.display();
				break;
				//Decaf Coffee
			case '6':
				menu.makeDrink(5);
				inventory.display();
				menu.display();
				break;
				//if invalid input
			default:
				System.out.println("Invalid selection: " + line);
				inventory.display();
				menu.display();
				break;
			}
		}
	}

}
