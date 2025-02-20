package br.com.mayer.criacionais;

public class FabricaDePlastico implements FabricaDeBrinquedos {
	@Override
	public Coelho criarCoelho() {
		// TODO Auto-generated method stub
		return new CoelhoDePlastico();
	}
		@Override
	public Ursinho criarUrsinho() {
		// TODO Auto-generated method stub
		return new UrsinhoDePlastico();
	}
	
	@Override
	public Tartaruga criarTartaruga() {
		// TODO Auto-generated method stub
		return new TartarugaDePlastico();
	}
}
