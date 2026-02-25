package erros;

public class EmailInvalidoException extends Exception {
    public EmailInvalidoException(String message) {
        super("Email Inválido: "+message);
    }
}
