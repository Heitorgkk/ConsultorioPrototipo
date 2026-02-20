package model.usuarios;

public class Medico extends Usuario {

    private String crm;
    private String especialidade;

    public Medico(String nome, String cpf, String email, String senha,
                  String crm, String especialidade){

        super(nome, cpf, email, senha);
        this.crm = crm;
        this.especialidade = especialidade;

    }

    public void exibirInfo(){




    }


    public void setCrm(String crm){
        this.crm = crm;
    }
    public String getCrm(){
        return crm;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public String getEspecialidade(){
        return especialidade;
    }

}
