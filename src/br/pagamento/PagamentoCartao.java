package br.pagamento;

import br.pagamento.pagamentoModel.Metodo;
import br.pagamento.pagamentoModel.Pagamento;
import br.pagamento.pagamentoModel.PagamentoModel;
import br.pagamento.pagamentoModel.Status;

public class PagamentoCartao extends PagamentoModel implements Pagamento {

    private String bandeira;
    private String cod_auth;
    private int parcelas;

    public PagamentoCartao(long id, double valor, Status status, Metodo metodo,
                           String bandeira, String cod_auth, int parcelas) {
        super(id, valor, status, metodo);
        this.setBandeira(bandeira);
        this.setCod_auth(cod_auth);
        this.setParcelas(parcelas);
    }

    public void processarPagamento(double valor){

        //TODO procss pagamento cartao
    }

    public int getParcelas() {
        return parcelas;
    }
    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public String getCod_auth() {
        return cod_auth;
    }
    public void setCod_auth(String cod_auth) {
        this.cod_auth = cod_auth;
    }

    public String getBandeira() {
        return bandeira;
    }
    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
}
