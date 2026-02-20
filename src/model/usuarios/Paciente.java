package model.usuarios;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Usuario {

    private List<String> historicoConsulta;

    public Paciente(String nome, String cpf, String email, String senha){

        super(nome, cpf, email, senha);
        this.historicoConsulta = new ArrayList<>();
    }

    public Paciente(String nome, String cpf, String email, String senha,
                    List<String> historico){

        super(nome, cpf, email, senha);
        this.historicoConsulta = historico;
    }

    public void exibirInfo(){}


}
