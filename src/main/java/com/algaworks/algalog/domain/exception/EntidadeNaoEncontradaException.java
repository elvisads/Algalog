package com.algaworks.algalog.domain.exception;

public class EntidadeNaoEncontradaException extends NegocioException {

	private static final long serialVersionUID = 1L;

	public EntidadeNaoEncontradaException(String mesage) {
		super(mesage);
	}
}
