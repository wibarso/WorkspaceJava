
public class carro {

	// vamos declarar as variaveis que compoem o tipo carro 
	String marca;
	String modelo;
	int ano;
	String cor;
	double preco;
	
	void exibirInfo() {
			System.out.println(" Automovel: " + marca + " - " + modelo);
			System.out.println("      Ano: " + ano);
			System.out.println("      Cor: " + cor);	
			System.out.println("    Preco: R$ "	+ preco);	
	}
	
	void aplicarDesconto(double percentual) {
		preco = preco - preco * percentual/100;
	}
	
	double calcularIpva() {
		double valoripva;
		if (ano < 2000) {
			valoripva = 0.0;
		}
		else	{
			valoripva = preco * 0.02;
		}
		return valoripva;
	}
}
