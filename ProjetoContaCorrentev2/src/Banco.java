import java.util.Scanner;

public class Banco {
	public static void main (String[] args) { ;
	
	Scanner teclado = new Scanner(System.in);
		int opcao;
		double valor;
		
	
	Conta c1;
	c1 = new Conta();
	c1.setNumeroConta(12345);
	c1.setDigitoVerif(6);
	c1.setNomeTitular("William Soares");
	c1.setCpfTitular("123.456.789-00");
	c1.setSaldo(500.00);
	
	
	// agora vem o menu 
	
	do {
		System.out.println(" bem vindo ao seu banco");
		System.out.println("Digite 1-info / 2-Deposito / 3- Saque / 0 - Encerrar");
		opcao = teclado.nextInt();
		switch (opcao) {
		case 1:
			System.out.println(c1.exibir());
			break;
		case 2:
			System.out.println("[DEPOSITO] Digite o valor:");
			valor = teclado.nextDouble();
			c1.depositar(valor);
			break;
		case 3:
			System.out.println("[SAQUE ] Digite o valor:");
			valor = teclado.nextDouble();
			if (c1.sacar(valor)) {
				System.out.println("Saque autorizado");
			}
		    else {
		    	System.out.println("Saldo Insulficiente");
		    }
		    break;
		case 0:
			System.out.println("-----> Obrigado pela preferencia!");
			break;
		default:
			System.out.println("ERRO: Opcao invalida");
			break;
		}
		
	} while (opcao != 0 );
		
		teclado.close();
	}
}
