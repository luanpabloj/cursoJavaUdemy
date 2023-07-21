package entities;

public class Funcionario {
	
	public String name;
	public double salary;
	public double tax;

	
	public double netSalary() {
		
		return salary - tax;
		
	}
	
	public void increaseSalary(double percent) {
		
		salary +=  salary * percent/100;

	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f%n", netSalary());
		
	}
	

}
