package model.usuarios;

import erros.CPFInvalidoException;
import erros.EmailInvalidoException;

public abstract class Usuario {

    protected String nome;
    protected String cpf;
    protected String email;
    protected String senha;

    public Usuario(String nome, String cpf, String email, String senha){
        if(!email.contains("@")) throw new EmailInvalidoException("Email deve conter @.");
        if(cpf.length() != 11) throw new CPFInvalidoException("Apenas números.");

        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public abstract void exibirInfo();

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getSenha(){
        return senha;
    }

}
