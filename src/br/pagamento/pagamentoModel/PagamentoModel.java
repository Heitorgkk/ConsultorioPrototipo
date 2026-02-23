package br.pagamento.pagamentoModel;

import java.time.LocalDateTime;

public abstract class PagamentoModel {

    protected long id;
    protected double valor;
    protected LocalDateTime dataHora;
    protected Status status;
    protected Metodo metodo;

    public PagamentoModel(long id, double valor, Status status, Metodo metodo){
        this.setId(id);
        this.setValor(valor);
        this.setStatus(status);
        this.setMetodo(metodo);
        this.setDataHora(LocalDateTime.now());
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public Metodo getMetodo() {
        return metodo;
    }
    public void setMetodo(Metodo metodo) {
        this.metodo = metodo;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
