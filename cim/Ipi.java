package cim;

public class Ipi implements ProductTax, ServiceTax{
	@Override
	public Double calculateTaxByService(Service service) {
		// TODO Auto-generated method stub
		return (service.getPrice() + service.getShipping() + service.getSafe()) * 0.15;
	}

	@Override
	public Double calculateTaxByProduct(Product product) {
		// TODO Auto-generated method stub
		return (product.getPrice() + product.getShipping() + product.getSafe()) * 0.15;
	}

}
