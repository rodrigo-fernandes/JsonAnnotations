package br.com.teste.core;

/**
 * Classe que define operações comuns para manipulação de boleanos
 * 
 * @author Rodrigo Fernandes
 */
public class BooleanUtils extends org.apache.commons.lang3.BooleanUtils {

	/**
	 * Faz a comparação dos caracteres e define quem vem primeiro
	 * 
	 * @param a - primeiro valor
	 * @param b - segundo valor
	 * @return {@link Boolean#compareTo(Boolean)}
	 */
	public static int compareTo(Boolean a, Boolean b) {
		if (a != null) {
			return a.compareTo(b);
		}
		return 0;
	}

}
