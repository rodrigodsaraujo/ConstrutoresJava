package Aula2;

public class TestandoClasse {
	
	public static void main(String []args) {
		// construtor padrao
		// criando obj e instanciando a classe
		Produto p1 = new Produto();
		p1.nome = "Moto G50";
		p1.marca = "Motorola";
		p1.valor = 1250.55f;
		
		// construtor de dois parametros
		Produto p2 = new Produto("Galaxy ","Samsung");
		p2.valor = 1315.70f;
		
		// construtor de tre paremetros 
		Produto p3 = new Produto("Iphone 11", "Apple",3000f);
		// erro de precisão no tipo float apenas espeficificar com o F
		
		
		System.out.println("Nome:" + p1.nome + " Marca: " + p1.marca + " valor: "+p1.valor);
		//verficando os valores dos outros obj.
		System.out.println("Nome:" + p2.nome + " Marca: " + p2.marca + " valor: "+p2.valor);
		System.out.println("Nome:" + p3.nome + " Marca: " + p3.marca + " valor: "+p3.valor);
	}

}
