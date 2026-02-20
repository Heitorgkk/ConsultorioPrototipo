package erros;

public class EmailInvalidoException extends RuntimeException {
    public EmailInvalidoException(String message) {
        super("Email Inválido: "+message);
    }
}
