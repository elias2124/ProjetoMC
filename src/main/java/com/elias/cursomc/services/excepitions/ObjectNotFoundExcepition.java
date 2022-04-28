package com.elias.cursomc.services.excepitions;

public class ObjectNotFoundExcepition extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundExcepition(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundExcepition(String msg, Throwable cause ) {
		super(msg, cause);
	}

}
