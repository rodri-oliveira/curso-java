package entities;

public class Approved {
	
	private String nameAluno;
	private double grade1;
	private double grade2;
	
	public Approved(String nameAluno, double grade1, double grade2) {
		this.nameAluno = nameAluno;
		this.grade1 = grade1;
		this.grade2 = grade2;
	}
	
	public double average() {
		return (grade1 + grade2) / 2;
	}

	public String getNameAluno() {
		return nameAluno;
	}

	public void setNameAluno(String nameAluno) {
		this.nameAluno = nameAluno;
	}

	public double getGrade1() {
		return grade1;
	}

	public void setGrade1(double grade1) {
		this.grade1 = grade1;
	}

	public double getGrade2() {
		return grade2;
	}

	public void setGrade2(double grade2) {
		this.grade2 = grade2;
	}
	
	
	
}
