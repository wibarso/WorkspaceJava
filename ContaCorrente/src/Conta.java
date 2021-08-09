
public class Conta {

	int nConta;
	int digVerificador;
	String nomeTitular;
	String cpf;
	double saldo;
	void exibirInfo()  {
		System.out.println("Conta Corrente:" + nConta + "-" + digVerificador);
		System.out.println(" Cliente: " + nomeTitular);
		System.out.println("CPF: " + cpf);
		System.out.println("saldo: " + saldo + "\n");
	}
}
	

