package model.consultas;

import model.usuarios.Medico;
import model.usuarios.Paciente;

public class ConsultaOnline extends Consulta{

    private String linkReuniao;

    public ConsultaOnline(long codigo, Paciente paciente, Medico medico,
                          String data, double valor, Status status, String linkReuniao){

        super(codigo, paciente, medico, data, valor, status);
        this.linkReuniao = linkReuniao;
    }


    public String detalhesConsulta(){
        return "";
    }

    public void setLinkReuniao(String linkReuniao){
        this.linkReuniao = linkReuniao;
    }
    public String getLinkReuniao(){
        return linkReuniao;
    }

}
