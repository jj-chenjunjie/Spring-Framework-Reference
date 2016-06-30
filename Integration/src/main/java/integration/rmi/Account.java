package integration.rmi;

import java.io.Serializable;

public class Account implements Serializable{

	private static final long serialVersionUID = -4334600861586278835L;
	
	private String name;

	public Account(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
