package br.com.teste.domain;

import java.util.ResourceBundle;

public class DominioResources {

	private ResourceBundle resource;
	
	private static DominioResources INSTANCE = new DominioResources();
	
	private DominioResources() {
		this.resource = ResourceBundle.getBundle("application");
	}
	
	public static DominioResources getInstance() {
		return INSTANCE;
	}
	
	protected ResourceBundle getResourceBundle() {
		return resource;
	}
	
	public void finished() {
		INSTANCE = null;
	}
	
}
