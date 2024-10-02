package cim;
import java.util.List;

public class Product {
	private String name;
	private Double price;
	private Double shipping;
	private Double safe; // seguro
	private List<ProductTax> taxes; // impostos
	private Double margemDeLucro; 
	
	 public Product(String name, Double price, Double shipping, Double safe,List<ProductTax> taxes) {
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
	
	List<ProductTax> getTaxes(){
		return this.taxes;
	}
	
	void setTaxes(List<ProductTax> taxes){
		this.taxes = taxes;
	}
	
	 Double calculateCustos() {
	        Double custo = 0.0;
	        for(ProductTax tax : taxes) {
	            custo += tax.calculateTaxByProduct(this); 
	        }
	        
	        return custo;
	    }
}
