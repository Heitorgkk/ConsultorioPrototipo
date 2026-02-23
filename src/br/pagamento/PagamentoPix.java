package br.pagamento;

import br.pagamento.pagamentoModel.*;

public class PagamentoPix extends PagamentoModel implements Pagamento {

    private String chavePix;
    private TipoChave tipoChave;

    public PagamentoPix(long id, double valor, Status status, Metodo metodo,
                        String chavePix, TipoChave tipoChave) {
        super(id, valor, status, metodo);
        this.setChavePix(chavePix);
        this.setTipoChave(tipoChave);
    }

    public void processarPagamento(double valor){
        //TODO processar pagamento PIX
    }

    public String getChavePix() {
        return chavePix;
    }
    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public TipoChave getTipoChave() {
        return tipoChave;
    }
    public void setTipoChave(TipoChave tipoChave) {
        this.tipoChave = tipoChave;
    }
}
