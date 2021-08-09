
public class Conta {
	int nConta;
	int digVerificador;
	String nomeTitular;
	String cpfTitular;
	double saldo;
	
	void exibir()  {
		System.out.println("Conta Corrente:" + nConta + "-" + digVerificador);
		System.out.println("Cliente: " + nomeTitular);
		System.out.println("CPF: " + cpfTitular);
		System.out.println("saldo: " + saldo + "\n");
	}
	
	void depositar(double valor)  {
		saldo =  saldo + valor;
	void sacar(double valor)  {
		if(saldo >= valor) {
			saldo =  saldo - valor;
			System.out.println("Saque autorizado na conta "+numeroConta+ "/" +digVerificador);
		}
		else  {
			System.out.println("Saque insuficiente");
			}
  		}
	}
}
