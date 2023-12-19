package CollectionQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Product1 {
	  private String name;

	  

	    public Product1(String name) {
	        this.name = name;
	    }

	 

	    public String getName() {
	        return name;
	    }
	

	 

//	class ProductNameComparator implements Comparator<Product1> {
//	    @Override
//	    public int compare(Product1 p1, Product1 p2) {
//	        return p1.getName().compareTo(p2.getName());
//	    }
	

	 

	
	  public static void main(String [] args) {
		  
	        // Create a list of products
	        List<Product1> products = new ArrayList<>();
	        products.add(new Product1("Shirt"));
	        products.add(new Product1("Shoes"));
	        products.add(new Product1("Pants"));
	        products.add(new Product1("Socks"));
	        products.add(new Product1("Sweater"));

	 
	        products.stream().filter(prod->prod.getName().toLowerCase().startsWith("s"))
            .forEach(prods->System.out.println(prods.getName()));
	        
	     
	    }
	}