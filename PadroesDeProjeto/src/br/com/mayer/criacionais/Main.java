package br.com.mayer.criacionais;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FabricaDeBrinquedos fabricaPelucia = new FabricaDePelucia();
		Coelho coelhoPelucia = fabricaPelucia.criarCoelho();
		Ursinho ursinhoPelucia = fabricaPelucia.criarUrsinho();
		Tartaruga tartarugaPelucia = fabricaPelucia.criarTartaruga();
		coelhoPelucia.exibir();
		ursinhoPelucia.exibir();
		tartarugaPelucia.exibir();
		
		FabricaDeBrinquedos fabricaPlastico = new FabricaDePlastico();
		Coelho coelhoPlastico = fabricaPlastico.criarCoelho();
		Ursinho ursinhoPlastico = fabricaPlastico.criarUrsinho();
		Tartaruga tartarugaDePlastico = fabricaPlastico.criarTartaruga();
		coelhoPlastico.exibir();
		ursinhoPlastico.exibir();
		tartarugaDePlastico.exibir();
	}

}
