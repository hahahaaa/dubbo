package org.dubbo.pojo;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -2624898666617719041L;
	public int id;
	public String name;



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
