package erros;

public class CPFInvalidoException extends Exception {
    public CPFInvalidoException(String message) {
        super("CPF Inválido: "+message);
    }
}
