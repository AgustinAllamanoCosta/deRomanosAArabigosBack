package com.transformador.transformadorRomanos.model;

public class Response {
	
	int status;
	String error;
	Object result;

	public Response() {
	}

	public Response(int status, Object result) {
		super();
		this.status = status;
		this.result = result;
	}

	public Response(int status, String error) {
		super();
		this.status = status;
		this.error = error;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

}
