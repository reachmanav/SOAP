package org.manav.javabrains;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.manav.javabrains.model.Product;


@WebService (targetNamespace="http://www.testmart.com")
public interface ProductCatalogInterface {

	@WebMethod(exclude=false)
	List<String> getProductCatalog();

	@WebMethod(exclude=false)
	List<String> getProduct(String category);

	@WebMethod(exclude=false)
	boolean addProduct(@WebParam(name="category") String category, int item);

	@WebMethod(exclude=false)
	@WebResult(partName="ProductPartO",name="ProductNameO")
	List<Product> getProductv2(@WebParam(partName="ProductPartI",name="ProductNameI") String category);

}