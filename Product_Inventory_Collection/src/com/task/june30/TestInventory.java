package com.task.june30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestInventory {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Product> ls = new ArrayList<>();

		do {
			System.out.println(
					"1)Add Product 2)Display Inventory 3)Search Product 4)Find Expensive Product 5)Calculate Total Inventory Value 6)exit" );

			System.out.println("Enter the choice:");
			int ch = sc.nextInt();

			
			switch (ch) {
			case 1:
				System.out.println("Enter the count of number you want to add");
				int N = sc.nextInt();
				// Add Product
				for (int i = 0; i < N; i++) {

					System.out.println("Enter the Id:");
					int id = sc.nextInt();
					
					sc.nextLine();
					System.out.println("Enter the name:");
					String name = sc.nextLine();

					System.out.println("Enter the price:");
					float price = sc.nextFloat();

					System.out.println("Enter the quantity:");
					int quantity = sc.nextInt();

					System.out.println("Enter the category:");
					String category = sc.nextLine();

					Product p = new Product(id, name, price, quantity, category);
					ls.add(p);
				}

				break;

			case 2:// Display Inventory
				for (Product list : ls) {
					System.out.println(list.id);
					System.out.println(list.name);
					System.out.println(list.price);
					System.out.println(list.quantity);
					System.out.println(list.category);
				}
				break;

			case 3:// 3)Search Product
				System.out.println("Enter the product name to be search:");
				String ProductName=sc.nextLine().toLowerCase();
				
				sc.nextLine();
				
				System.out.println("product id:");
				int id=sc.nextInt();
				
					for(Product p:ls) {
						if(p.name.equals(ProductName) || p.id==id) {
							System.out.println("Product exists");
							System.out.println(id+" "+ProductName);
						}
					}
				
				break;

			case 4:// 4)Find Expensive Product
				float MaxPriceProduct=0.0f;
				String product=ls.get(0).name;
				MaxPriceProduct=ls.get(0).price;
				for(Product p:ls) {
					 
					if(MaxPriceProduct < p.price) {
						MaxPriceProduct =p.price;
						product=p.name;
					}
				}
				System.out.println("Product which is expensive is "+ product +" and price of the product is "+MaxPriceProduct);
				break;

			case 5:// 5)Calculate Total Inventory Value
				float Total=0;
				
				for(Product list:ls) {
					Total+=list.price*list.quantity;
				}
				System.out.println("Total price is:"+Total);
				break;
				
			case 6:
				System.out.println("Thank you");
				sc.close();
				System.exit(0);
			default:
				System.out.println("Invalid option");
			}

		} while (true);
	}
}
