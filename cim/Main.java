package cim;

import java.util.ArrayList;
import java.util.List;

public class Main {
	  public static void main(String[] args) {
		  	ProductTax productIpi = new Ipi();
		  	ProductTax productIcms = new Icms(0.12); // assumindo que a aliquota é de 12%
		  	
		  	List<ProductTax> productTaxes = new ArrayList<ProductTax>();
		  	productTaxes.add(productIpi);
		  	productTaxes.add(productIcms);
		  	
            Product product = new Product("Produto teste", 12.0, 2.0, 3.0, productTaxes);
            
            Double productCostTotal = product.calculateCustos();
            System.out.println("Custo total com impostos do produto: " + productCostTotal);
            
            ServiceTax serviceIpi = new Ipi();
		  	ServiceTax serviceIcms = new Icms(0.12); // assumindo que a aliquota é de 12%
		  	ServiceTax serviceIss = new Iss(0.16); // assumindo que a aliquota praticada é de 16%
		  	
		  	List<ServiceTax> serviceTaxes = new ArrayList<ServiceTax>();
		  	serviceTaxes.add(serviceIpi);
		  	serviceTaxes.add(serviceIcms);
		  	serviceTaxes.add(serviceIss);
		  	
		  	Service service = new Service("Serviço teste", 30.0, 2.0, 3.0, serviceTaxes);
		  	
		  	Double serviceCostTotal = service.calculateCustos();
            System.out.println("Custo total com impostos do serviço: " + serviceCostTotal);
	    }
}
