package com.cts.iptms.exceptionhandling;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class ExceptionResponse {

	private Date timestamp;
	private String message;
	private String details;

	
}
