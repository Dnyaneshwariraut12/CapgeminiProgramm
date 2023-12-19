package StreamApi;

import java.util.ArrayList;
import java.util.List;

public class Product {

	int Id;
	String name;
	float price;
	
	
	public Product(int id, String name, float price) {
		super();
		Id = id;
		this.name = name;
		this.price = price;
	}


	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1,"Hp Laptop", 25000f));
		productList.add(new Product(2,"Dell Laptop", 30000f));
		productList.add(new Product(3,"Lenevo Laptop",28000f));  
		productList.add(new Product(4,"Sony Laptop",28000f));  
		productList.add(new Product(5,"Apple Laptop",90000f)); 
		
	      productList.stream()

	      .filter(product->product.price==30000)
	     .forEach(product->System.out.println(product.name));
          
	}

}
