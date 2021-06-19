package org.dbs.crawl.exception;

public class RecordNotFound extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String message;

	public RecordNotFound(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
