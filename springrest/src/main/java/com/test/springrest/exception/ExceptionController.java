package com.test.springrest.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(CustomException.class)
	public ErrorDetail retrieveError(HttpServletRequest httpServletRequest, Exception exception) {
		ErrorDetail detail = new ErrorDetail();
		detail.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		detail.setMessage("Service not available");
		detail.setUrl(httpServletRequest.getRequestURL().toString());
		return detail;
	}
}
