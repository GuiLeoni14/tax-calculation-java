package cim;

import java.util.List;

public class Service {
	private String name;
	private Double price;
	private Double shipping;
	private Double safe; // seguro
	private List<ServiceTax> taxes; // impostos
	private Double margemDeLucro; 
	
	 public Service(String name, Double price, Double shipping, Double safe,List<ServiceTax> taxes) {
        this.name = name;
        this.price = price;
        this.taxes = taxes;
        this.shipping = shipping;
        this.safe = safe;
	}
	 
	 String getName() {
			return this.name;
		}
		
		Double getSafe() {
			return this.safe;
		}
		
		Double getShipping() {
			return this.shipping;
		}
		
		Double getPrice() {
			return this.price;
		}
		
		List<ServiceTax> getTaxes(){
			return this.taxes;
		}
		
		void setTaxes(List<ServiceTax> taxes){
			this.taxes = taxes;
		}
		
		 Double calculateCustos() {
		        Double custo = 0.0;
		        for(ServiceTax tax : taxes) {
		            custo += tax.calculateTaxByService(this); 
		        }
		        
		        return custo;
		    }

}
