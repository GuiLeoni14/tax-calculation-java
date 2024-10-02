package cim;

public class Icms implements ProductTax, ServiceTax{
	private Double aliquota; // assumindo que a alicota é 12.0
	
	public Icms(Double aliquota) {
		this.aliquota = aliquota;
	}
	@Override
	public Double calculateTaxByService(Service service) {
		// TODO Auto-generated method stub
		return service.getPrice() * this.aliquota;
	}

	@Override
	public Double calculateTaxByProduct(Product product) {
		// TODO Auto-generated method stub
		return (product.getPrice() + product.getShipping() + product.getSafe()) * 0.15;
	}

}

