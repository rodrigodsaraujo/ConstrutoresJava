package Aula2;

public class Produto {
	
	// atributos
	
	String nome;
	String marca;
	float valor;
	
	// construtor
	
	Produto(){
		// definindo o construtor padrao para testar
		// a classe mais a frente
	}
	
	// criando obj e recendo por parametro os valores
	//dos atributos que eu defini na classe
	
	Produto(String nome){
		this.nome = nome;
		// o erro apresentado é 
		//por causa da duplicidade dos parametros ()
	}
	
	Produto(String nome, String marca){
		this.nome = nome;
		this.marca = marca;
		
	}
	
	Produto(String nome, String marca, float valor){
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
	}

}
