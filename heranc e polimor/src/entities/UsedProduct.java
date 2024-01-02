package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufacture;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufacture) {
		super(name, price);
		this.manufacture = manufacture;
	}

	public Date getManufacture() {
		return manufacture;
	}

	public void setManufacture(Date manufacture) {
		this.manufacture = manufacture;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(getName());
		sb.append(" (used) ");
		sb.append(" $" + String.format("%.2f", getPrice()));
		sb.append(" (Manufacture date: " + sdf.format(manufacture) + ")");
		
		return sb.toString();
	}
	
}
