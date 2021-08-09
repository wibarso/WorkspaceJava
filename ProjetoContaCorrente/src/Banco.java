
public class Banco {
		public static void main(String[] args)  {
		
		Conta c1;
		c1 = new Conta();
		
		c1.nConta 			= 12345;
		c1.digVerificador 	= 6;
		c1.nomeTitular 		= "William Soares";
		c1.cpfTitular 		= "123.456.789-00";
		c1.saldo			= 200.00;
		
		c1.exibir();
		System.out.println("-------------");
		c1.depositar(50,00);
		c1.exibir();
		System.out.println("-------------");
		c1.sacar(200,00);
		c1.exibir();
		System.out.println("-------------");
		c1.sacar

		}
}
