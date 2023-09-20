package br.com.teste.model;

import br.com.teste.core.json.annotation.JsonCPFCNPJFormat;
import br.com.teste.core.json.annotation.JsonTelefoneFormat;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "ds_nome", length = 100)
	private String nome;

	@JsonTelefoneFormat
	@Column(name = "ds_fone")
	private String fone;

	@JsonCPFCNPJFormat
	@Column(name = "ds_cpf")
	private String cpf;

	@JsonCPFCNPJFormat
	@Column(name = "ds_cnpj")
	private String cnpj;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
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

}
