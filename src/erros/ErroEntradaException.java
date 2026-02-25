package erros;

public class ErroEntradaException extends Exception {
    public ErroEntradaException(String message) {
        super("Entrada Inválida: "+message);
    }
}
