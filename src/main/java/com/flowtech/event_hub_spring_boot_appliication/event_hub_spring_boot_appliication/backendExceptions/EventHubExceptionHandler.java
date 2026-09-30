package com.flowtech.event_hub_spring_boot_appliication.event_hub_spring_boot_appliication.backendExceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EventHubExceptionHandler {
     
	@ExceptionHandler(value=RuntimeException.class)
	public ResponseEntity<?> runTimeExceptionHandler(RuntimeException Exception){
		return ResponseEntity.ok(Exception.getMessage());
	}
}
