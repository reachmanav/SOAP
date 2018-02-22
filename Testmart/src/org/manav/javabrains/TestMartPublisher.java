package org.manav.javabrains;

import javax.xml.ws.Endpoint;

public class TestMartPublisher {
	
	

	public static void main(String[] args) {


		Endpoint.publish("http://localhost:1111/pc", new ProductCatalog());

	}

}
