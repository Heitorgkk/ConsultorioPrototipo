package model.consultas;

import model.usuarios.Medico;
import model.usuarios.Paciente;

public class ConsultaEmergencia extends Consulta{

    private String nivelUrgencia;

    public ConsultaEmergencia(long codigo, Paciente paciente, Medico medico,
                              String data, double valor, Status status, String nivelUrgencia){

        super(codigo, paciente, medico, data, valor, status);
        this.nivelUrgencia = nivelUrgencia;
    }


    public String detalhesConsulta(){
        return "";
    }

}
