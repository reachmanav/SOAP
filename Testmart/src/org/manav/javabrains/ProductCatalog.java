package org.manav.javabrains;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.manav.javabrains.business.ProductServiceImpl;
import org.manav.javabrains.model.Product;




@WebService( endpointInterface = "org.manav.javabrains.ProductCatalogInterface",
			portName="TestMartServicePort", 
			name="TestMartServicePort2" //name of the component which gets deployed
			)
//@SOAPBinding(style=Style.RPC)
public class ProductCatalog implements ProductCatalogInterface {

	private ProductServiceImpl productServiceImpl = new ProductServiceImpl();
	
	
	public List<String> getProductCatalog()  {		
		return productServiceImpl.getProductCatalog();
	}
	
	
	public List<String> getProduct(String category)  {		
		return productServiceImpl.getProduct(category);
	}
	
	
	
	public boolean addProduct(String category, int item)  {		
		return productServiceImpl.addProduct(category, String.valueOf(item));
	}
	
	

	public List<Product> getProductv2(String category)  {	
		return productServiceImpl.getProductv2(category);
	}
	
}
