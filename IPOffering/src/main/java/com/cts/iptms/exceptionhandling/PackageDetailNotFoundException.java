package com.cts.iptms.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class PackageDetailNotFoundException  extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public PackageDetailNotFoundException(String packageName) {
		super("Unable to Find Package with Name - "+packageName);
	}
}
