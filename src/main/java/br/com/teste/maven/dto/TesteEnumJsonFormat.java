package br.com.teste.maven.dto;

public enum TesteEnumJsonFormat {

	TESTE1, 
	TESTE2;

	private String denominacao;

	private TesteEnumJsonFormat() {
		this.denominacao = "format_" + this.name();
	}

	public String getDenominacao() {
		return denominacao;
	}

	@Override
	public String toString() {
		return this.getDenominacao();
	}

}
