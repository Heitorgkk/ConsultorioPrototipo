package erros;

public class CPFInvalidoException extends RuntimeException {
    public CPFInvalidoException(String message) {
        super("CPF Inválido: "+message);
    }
}
