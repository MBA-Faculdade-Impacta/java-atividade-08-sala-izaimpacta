package br.com.impacta.lab;

public class PessoaFisica implements Pessoa {

	private String documento;
	private String tipo;

	public PessoaFisica(String documento, String tipo){
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