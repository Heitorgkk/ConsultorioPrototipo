package model.consultas;

import model.usuarios.Medico;
import model.usuarios.Paciente;

public class ConsultaPresencial extends Consulta{

    private String sala;

    public ConsultaPresencial(long codigo, Paciente paciente, Medico medico,
                              String data, double valor, Status status, String sala){

        super(codigo, paciente, medico, data, valor, status);
        this.sala = sala;
    }

    public String detalhesConsulta(){
        return "";
    }

    public void setSala(String sala){
        this.sala = sala;
    }
    public String getSala(){
        return sala;
    }

}
