package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName());
		sb.append(" (used) $");
		sb.append(String.format("%.2f", getPrice()));
		sb.append(" (Manufactore date : ");
		sb.append(new SimpleDateFormat("dd/MM/yyy").format(manufactureDate));
		sb.append(")");
		return sb.toString();
	}
}
