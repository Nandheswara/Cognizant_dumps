package com.exception;

public class NoOrdersFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public NoOrdersFoundException(String msg) {
		super(msg);
	}

}
