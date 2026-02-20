package model.consultas;

import model.usuarios.Medico;
import model.usuarios.Paciente;

public abstract class Consulta {

    protected long codigo;
    protected Paciente paciente;
    protected Medico medico;
    protected String data;
    protected double valor;
    protected Status status;

    public Consulta(long codigo, Paciente paciente, Medico medico, String data,
                    double valor, Status status){

        this.codigo = codigo;
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.valor = valor;
        this.status = status;
    }

    public abstract String detalhesConsulta();


    public long getCodigo() {
        return codigo;
    }
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }


    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }


    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }


    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }


    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }


    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

}