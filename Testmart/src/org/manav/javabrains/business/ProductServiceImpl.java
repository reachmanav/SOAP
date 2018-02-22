package org.manav.javabrains.business;

import java.util.ArrayList;
import java.util.List;

import org.manav.javabrains.model.Product;

public class ProductServiceImpl {

	
	List <String> bookList = new ArrayList<>();
	List <String> musicList = new ArrayList<>();
	List <String> movieList = new ArrayList<>();
	
	
	public ProductServiceImpl ()  {
		
		bookList.add("Book1");
		bookList.add("Book2");
		bookList.add("Book3");
		
		musicList.add("Music1");
		musicList.add("Music2");
		musicList.add("Music3");
		
		movieList.add("Movie1");
		movieList.add("Movie2");
		movieList.add("Movie3");
				
	}
	
public List<String> getProductCatalog()  {		
		List <String> categories = new ArrayList<>();		
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");		
		return categories;
	}


public List<String> getProduct(String category)  {
	
	switch(category.toLowerCase())  {
		case ("books"):
			return bookList;
		case ("music"):
			return musicList;
		case ("movies"):
			return movieList;	
	}
	
	return null;
}


public boolean addProduct(String category, String item)  {
	
	switch(category.toLowerCase())  {
		case ("books"):
			bookList.add(item);
			return true;
		case ("music"):
			musicList.add(item);
			return true;
		case ("movies"):
			movieList.add(item);
			return true;	
	}
	
	return false;
}

public List<Product> getProductv2(String category) {
	List <Product> productList = new ArrayList<> ();
	productList.add(new Product("Book1","1234",999.99));
	productList.add(new Product("Book1","1234",999.99));
	return productList;
}



}
