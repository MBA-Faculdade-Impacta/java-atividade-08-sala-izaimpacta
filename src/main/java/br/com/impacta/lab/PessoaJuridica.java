package br.com.impacta.lab;

public class PessoaJuridica implements Pessoa {

	private String documento;
	private String tipo;

	public PessoaJuridica(String documento, String tipo){
		this.documento = documento;
		this.tipo = tipo;
	}

	public String falarDocumento() {
		return this.documento;
	}

	public String getTipo() {
		return this.tipo;
	}
}