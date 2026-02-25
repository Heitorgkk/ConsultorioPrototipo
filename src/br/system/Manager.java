package br.system;

import model.consultas.Consulta;
import model.usuarios.Medico;
import model.usuarios.Paciente;

import java.util.List;
import java.util.ArrayList;


public class Manager {

    private List<Consulta> consultaList;
    private List<Medico> medicoList;
    private List<Paciente> pacienteList;

    public Manager(){
        consultaList = new ArrayList<>();
        medicoList = new ArrayList<>();
        pacienteList = new ArrayList<>();
    }

    public Consulta agendarConsulta(Paciente paciente, Medico medico, double valor){


        return new Consulta();



    }

}
