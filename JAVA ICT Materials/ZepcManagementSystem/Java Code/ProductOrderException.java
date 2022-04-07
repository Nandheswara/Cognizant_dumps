package com.cts.zepcpd.exception;

public class ProductOrderException extends Exception {

	private static final long serialVersionUID = -1105431869622052445L;

	/**
	 * @param message
	 * @param cause
	 */
	public ProductOrderException(String message, Throwable cause) {
		super(message, cause);
	}
}
