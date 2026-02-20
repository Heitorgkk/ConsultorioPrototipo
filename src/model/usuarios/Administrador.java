package model.usuarios;

public class Administrador extends Usuario {

    private int nivelAcesso;

    public Administrador(String nome, String cpf, String email, String senha,
                         int nivelAcesso){

        super(nome, cpf, email, senha);
        this.nivelAcesso = nivelAcesso;
    }

    public void exibirInfo(){

    }


    public void setNivelAcesso(int nivelAcesso){
        this.nivelAcesso = nivelAcesso;
    }
    public int getNivelAcesso(){
        return nivelAcesso;
    }

}
