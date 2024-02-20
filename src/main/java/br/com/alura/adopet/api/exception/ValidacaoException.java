package br.com.alura.adopet.api.exception;

public class ValidacaoException extends RuntimeException{ //para criação de exceções não checadas no java
    public ValidacaoException(String message) {
        super(message);
    }
}
