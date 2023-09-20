package br.com.teste.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * 
 * @author Rodrigo Fernandes
 */
@Entity
@Table(name = "pessoa")
public class PessoaEntity extends Pessoa {

	@Override
	public String toString() {
		return "PessoaEntity [getId()=" + getId() + ", getNome()=" + getNome() + ", getFone()=" + getFone()
				+ ", getCpf()=" + getCpf() + ", getCnpj()=" + getCnpj() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
