package model.consultas;

import model.usuarios.Medico;
import model.usuarios.Paciente;

public class ConsultaEmergencia extends Consulta{

    private String nivelUrgencia;

    public ConsultaEmergencia(Paciente paciente, Medico medico,
                              double valor, Status status, String nivelUrgencia){

        super(paciente, medico, valor, status);
        this.nivelUrgencia = nivelUrgencia;
    }


    public String detalhesConsulta(){
        //TODO detalhes consulta emergencia
        return "";
    }

    public void setNivelUrgencia(String nivelUrgencia){
        this.nivelUrgencia = nivelUrgencia;
    }
    public String getNivelUrgencia(){
        return nivelUrgencia;
    }

}
