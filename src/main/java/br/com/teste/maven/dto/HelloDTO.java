package br.com.teste.maven.dto;

import br.com.teste.core.json.annotation.JsonCPFCNPJFormat;
import br.com.teste.core.json.annotation.JsonCepFormat;
import br.com.teste.core.json.annotation.JsonEnumFormat;
import br.com.teste.core.json.annotation.JsonTelefoneFormat;

//import br.com.teste.core.json.annotation.JsonEnumFormat;

public class HelloDTO {

	private String message;
	@JsonEnumFormat
	private TesteEnumJsonFormat testeTipoJson;

	@JsonCPFCNPJFormat
	private String cpf;

	@JsonCPFCNPJFormat
	private String cnpj;

	@JsonCepFormat
	private String cep;

	@JsonTelefoneFormat
	private String fone;

	public HelloDTO() {
	}

	public String getMessage() {
		return message;
	}

	public TesteEnumJsonFormat getTesteTipoJson() {
		return testeTipoJson;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setTesteTipoJson(TesteEnumJsonFormat testeTipoJson) {
		this.testeTipoJson = testeTipoJson;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

}
