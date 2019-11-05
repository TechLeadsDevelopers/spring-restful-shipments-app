package com.spring.restful.shipments.app.validator;

import java.util.List;

public class ApiInputError {
	private String code;
	private List<FieldError> errors;

	public ApiInputError() {
	}

	public ApiInputError(String code, List<FieldError> errors) {
		this.code = code;
		this.errors = errors;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<FieldError> getErrors() {
		return errors;
	}

	public void setErrors(List<FieldError> errors) {
		this.errors = errors;
	}

	@Override
	public String toString() {
		return "ApiInputError [code=" + code + ", errors=" + errors + "]";
	}

}
