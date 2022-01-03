package com.xoriant.product.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(value = NullPointerException.class)
	public Object handleNullPointerException() {
		return null;
	}
	
	@ExceptionHandler(value = ClassNotFoundException.class)
	public Object handleClassNotFoundException() {
		return null;
	}
}
