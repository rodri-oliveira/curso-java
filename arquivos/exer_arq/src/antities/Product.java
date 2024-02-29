package antities;

public class Product {
	
	private String name;
	private Double price;
	private Integer quantitiy;
	
	public Product(String name, Double price, Integer quantitiy) {
		this.name = name;
		this.price = price;
		this.quantitiy = quantitiy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrive() {
		return price;
	}

	public void setPrive(Double prive) {
		this.price = prive;
	}

	public Integer getQuantitiy() {
		return quantitiy;
	}

	public void setQuantitiy(Integer quantitiy) {
		this.quantitiy = quantitiy;
	}
	
	public double total() {
		return price * quantitiy;
	}
}
