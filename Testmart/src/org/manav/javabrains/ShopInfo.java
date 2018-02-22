package org.manav.javabrains;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.manav.javabrains.exception.InvalidInputException;

@WebService(targetNamespace="http://www.testmart.com",portName="ShopInfoPort1",
			name="ShopInfoPort2",serviceName="ShopInfoService")
@SOAPBinding(style=Style.RPC)
public class ShopInfo {

	@WebMethod(operationName="GetShopInfo")
	@WebResult(partName="prop_out")
	public String getShopInfo(@WebParam(partName="prop",name="prop2") String property) throws InvalidInputException   {
		String response = "Invalid Property";
		
		if ("shopName".equals(property))  {
			response = "Test Mart";
		} else if ("since".equals(property))  {
			response = "since 2012";
		} else {
			throw new InvalidInputException("invalid input", property + "is unknown");
		}
		
		return response;
	}
}
