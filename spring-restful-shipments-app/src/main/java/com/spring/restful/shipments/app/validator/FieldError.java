package com.spring.restful.shipments.app.validator;

public class FieldError {
	private String name;
	private String message;
	
	public FieldError() {
	}
	
	public FieldError(String name, String message) {
		this.name = name;
		this.message = message;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "FieldError [name=" + name + ", message=" + message + "]";
	}
	
}
