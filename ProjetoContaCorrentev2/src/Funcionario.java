
public class Funcionario {
	private int numFuncional;
	private String nome;
	private String email;
	private double salario;
	
	// vou criar um m�todo espec�fico, que s� pode ser chamado no momento do NEW...
	// este m�todo � chamado CONSTRUTOR e serve geralmente para inicializar valores no objeto
	public Funcionario(int numFuncional, String nome, String email, double salario) {
		this.numFuncional = numFuncional; 
		this.nome = nome;
		this.email = email;
		this.salario = salario;		
	}
	
	public String exibir() {
		return numFuncional +" "+nome+" ("+email+") R$ "+salario;
	}
	
	public void reajustarSalario(double percentual) {
		salario = salario + salario * percentual/100;
	}
	
	public double calcularImposto() {
		if (salario <= 2000.00) {
			return 0.0;
		}
		else if (salario <= 3000.0) {
			return salario * 0.15;
		}
		else if (salario <= 4500.00) {
			return salario * 0.25;
		}
		else {
			return 2250;
		}
	}

	public int getNumFuncional() {
		return numFuncional;
	}

	public void setNumFuncional(int numFuncional) {
		this.numFuncional = numFuncional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
