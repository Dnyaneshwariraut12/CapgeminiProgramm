package CollectionQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Product {
	int id ;
	String name;
	
	
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(new Product(1, "HP laptop"));
		productList.add(new Product(2, "Dell laptop"));
		productList.add(new Product(3, "Sony laptop"));
		productList.add(new Product(3, "Sony laptop"));
		
		Collections.sort(productList, new Comparator<Product>(){
			public int compare(Product p1,Product p2) {
				return(p2.getName()).compareToIgnoreCase(p1.getName());
			}
			
		});
		for(Product p : productList) {
			System.out.println(p.getId()+" " + p.getName());
		}
	}

}
