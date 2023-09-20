package br.com.teste.core.loader;

import java.util.Locale;

/**
 * Classe que gerencia e disponibiliza acesso aos componentes do sistema
 * 
 * @author Rodrigo Fernandes
 */
public final class Application {

	private static ApplicationLoaderModel applicationLoaderModel;

	static {
		Locale.setDefault(new Locale("pt", "BR"));
	}

	private Application() {

	}

	/**
	 * Verifica se existe algum modelo associado para controle dos beans
	 * 
	 * @return true se existir um modelo configurado
	 */
	public static boolean isLoaded() {
		return applicationLoaderModel != null;
	}

	/**
	 * Informa o controlador responsavel pela busca dos beans da aplicação
	 * 
	 * @param applicationLoaderModel - informa o controlador
	 */
	public static void setApplicationLoaderModel(ApplicationLoaderModel applicationLoaderModel) {
		Application.applicationLoaderModel = applicationLoaderModel;
	}

	/**
	 * Retorna um componente que é do tipo especificado em type e que seja
	 * Singleton. Várias chamadas para o mesmo componente retornará a mesma
	 * instância.
	 * 
	 * @param type - o tipo que deve ser pesquisado
	 * @return um componente do tipo <T>
	 */
	public static <T> T getSingleton(Class<T> type) {
		return isLoaded() ? applicationLoaderModel.getSingleton(type) : null;
	}

	/**
	 * Retorna um componente que é do tipo especificado em type e que seja
	 * Singleton. Várias chamadas para o mesmo componente retornará a mesma
	 * instância.
	 * 
	 * @param name - o nome do componente que deve ser pesquisado
	 * @param type - o tipo que deve ser pesquisado
	 * @return um componente do tipo <T>
	 * 
	 */
	public static <T> T getSingleton(String name, Class<T> type) {
		return isLoaded() ? applicationLoaderModel.getSingleton(name, type) : null;
	}

}
