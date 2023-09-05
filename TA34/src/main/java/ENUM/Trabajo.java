package ENUM;

public enum Trabajo {
	ALBANIL(14000), JEFEOBRA(21000), ARQUITECTO(30000), INGENIERO(40000);

	public final double salario;
	
	private Trabajo (double salario){
		this.salario = salario;
	}
	double getSalario() {
	    return salario;
	}
}
