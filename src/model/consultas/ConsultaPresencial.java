package model.consultas;

import model.usuarios.Medico;
import model.usuarios.Paciente;

public class ConsultaPresencial extends Consulta{

    private String sala;

    public ConsultaPresencial(Paciente paciente, Medico medico,
                              double valor, Status status, String sala){

        super(paciente, medico, valor, status);
        this.sala = sala;
    }

    public String detalhesConsulta(){
        //TODO detalhes consulta presencial
        return "";
    }

    public void setSala(String sala){
        this.sala = sala;
    }
    public String getSala(){
        return sala;
    }

}
