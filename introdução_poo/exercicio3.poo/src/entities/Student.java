package entities;

public class Student {
	
	public double nota1;
	public double nota2;
	public double nota3;
	public String nome;
	
	public double somarNotas() {
		return nota1 + nota2 + nota3;
	}
	
	public String verificaNota() {
		return (nota1 + nota2 + nota3) >= 60.0 ? "Pass" : "Failed"; 
	}
	

	public String toString() {
		return "Final Grade = "
				+ " "
				+ somarNotas()
				+ " - "
				+ verificaNota();
	}

}
