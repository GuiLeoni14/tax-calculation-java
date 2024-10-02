package cim;

public class Iss implements ServiceTax{
	private Double aliquotaPraticada; 
	
	public Iss(Double aliquotaPraticada) {
		this.aliquotaPraticada = aliquotaPraticada;
	}
	@Override
	public Double calculateTaxByService(Service service) {
		// TODO Auto-generated method stub
		return service.getPrice() * this.aliquotaPraticada;
	}

}
