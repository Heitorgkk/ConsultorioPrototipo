package model.consultas;

import model.usuarios.Medico;
import model.usuarios.Paciente;

public class ConsultaOnline extends Consulta{

    private String linkReuniao;

    public ConsultaOnline(Paciente paciente, Medico medico,
                          double valor, Status status, String linkReuniao){

        super(paciente, medico, valor, status);
        this.linkReuniao = linkReuniao;
    }


    public String detalhesConsulta(){
        //TODO detalhes consulta online
        return "";
    }

    public void setLinkReuniao(String linkReuniao){
        this.linkReuniao = linkReuniao;
    }
    public String getLinkReuniao(){
        return linkReuniao;
    }

}
