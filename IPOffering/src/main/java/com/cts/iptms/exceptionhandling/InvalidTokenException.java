package com.cts.iptms.exceptionhandling;



public class InvalidTokenException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidTokenException() {
		super("The Token is Either Expired or Wrong");
		
	}

}