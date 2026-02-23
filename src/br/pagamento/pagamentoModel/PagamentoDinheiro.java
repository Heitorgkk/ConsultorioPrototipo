package br.pagamento.pagamentoModel;

public class PagamentoDinheiro extends PagamentoModel implements Pagamento{

    private double valorRecebido;
    private double troco;

    public PagamentoDinheiro(long id, double valor, Status status, Metodo metodo,
                             double valorRecebido, double troco) {
        super(id, valor, status, metodo);
        this.setValorRecebido(valorRecebido);
        this.setTroco(troco);
    }

    public void processarPagamento(double valor){
        //TODO processar pagamento Dinheiro
    }

    public double getValorRecebido() {
        return valorRecebido;
    }
    public void setValorRecebido(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public double getTroco() {
        return troco;
    }
    public void setTroco(double troco) {
        this.troco = troco;
    }

}
