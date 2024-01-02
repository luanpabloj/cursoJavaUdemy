package entities;

public class ImportedProduct extends Product{
	
	private Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb1 = new StringBuilder();
		
		sb1.append(getName());
		sb1.append(" $" + String.format("%.2f", totalPrice()));
		sb1.append(" Customs fee: $" + String.format("%.2f", customsFee));
		
		return sb1.toString();
	}
}
