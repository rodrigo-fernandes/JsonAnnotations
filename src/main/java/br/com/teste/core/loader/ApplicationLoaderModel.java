package br.com.teste.core.loader;

/**
 * @author Rodrigo Fernandes
 */
public interface ApplicationLoaderModel {

	/**
	 * Retorna um componente que é do tipo específico em type e que seja singleton.
	 * Várias chamadas para o mesmo componente retornará a mesma instância.
	 * 
	 * @param type - o tipo que deve ser pesquisado
	 * @return um componente do tipo <T>
	 */
	<T> T getSingleton(Class<T> type);

	/**
	 * Retorna um componente que é do tipo especificado em type e que seja
	 * Singleton. Várias chamadas para o mesmo componente retornará a mesma
	 * instância.
	 * 
	 * @param name - o nome do componente que deve ser pesquisado
	 * @param type - o tipo que deve ser pesquisado
	 * @return um componente do tipo <T>
	 */
	<T> T getSingleton(String name, Class<T> type);

}
