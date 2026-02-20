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




}