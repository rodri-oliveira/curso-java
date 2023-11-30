package entities;

public class Retangulo {
	
	public double heigth;
	public double widht;
	
	public Retangulo(double heigth, double widht) {
		this.heigth = heigth;
		this.widht = widht;
	}
	
	public double area() {
		return heigth * widht;
	}
	
	public double perimeter() {
		return 2 * (heigth + widht);
	}
	
	public double diagonal() {
		return Math.sqrt(heigth * heigth + widht * widht);
	}
	

}
