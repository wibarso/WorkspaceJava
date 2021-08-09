
public class Loja {
	public static void main(String[] args) {
		carro c1;
		carro c2;
	
		c1 = new carro();
		c2 = new carro();
		
		c1.marca = "Porche";
		c1.modelo = "Kaineni";
		c1.ano = 2021;
		c1.cor = "Preto";
		c1.preco = 78000;	
		
		c2.marca = "chevrolet";
		c2.modelo = "corsa";
		c2.ano = 1997;
		c2.cor	=	"prata";
		c2.preco = 7000;
		
		
		/*System.out.println("Automóvel: "+c1.marca+ " - " +c1.modelo);
		System.out.println("      ano: "+c1.ano);
		System.out.println("      cor: "+c1.cor);
		System.out.println("    Preço: R$ "+c1.preco);*/
		
		c1.exibirInfo();
		c2.exibirInfo();
		
		c1.aplicarDesconto(10.0);
		c2.aplicarDesconto(5.0);
		System.out.println("--------------------");
		c1.exibirInfo();
		c2.exibirInfo();
		
		System.out.println("Valor do ipva do "+c1.modelo+" = "+c1.calcularIpva());
		System.out.println("Valor do ipva do "+c2.modelo+" = "+c2.calcularIpva());
		
		
	}	
}
