package br.com.mayer.criacionais;

public class FabricaDePelucia implements FabricaDeBrinquedos {
	@Override
	public Coelho criarCoelho() {
		// TODO Auto-generated method stub
		return new CoelhoDePelucia();
	}
	@Override
	public Ursinho criarUrsinho() {
		// TODO Auto-generated method stub
		return new UrsinhoDePelucia();
	}
	
	@Override
	public Tartaruga criarTartaruga() {
		// TODO Auto-generated method stub
		return new TartarugaDePelucia();
	}
}
