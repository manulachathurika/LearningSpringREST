package com.luv2code.springdemo.exception;

public class CustomerNotFountException extends RuntimeException {

	private static final long serialVersionUID = 282503823086459260L;

	public CustomerNotFountException() {
		super();
	}

	public CustomerNotFountException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public CustomerNotFountException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public CustomerNotFountException(String arg0) {
		super(arg0);
	}

	public CustomerNotFountException(Throwable arg0) {
		super(arg0);
	}
	
}
