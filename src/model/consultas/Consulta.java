package model.consultas;

import model.usuarios.Medico;
import model.usuarios.Paciente;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public abstract class Consulta {

    private static long cod_increment = 0;

    protected long codigo;
    protected Paciente paciente;
    protected Medico medico;
    protected LocalDate data;
    protected LocalTime hora;
    protected double valor;
    protected Status status;

    public Consulta(Paciente paciente, Medico medico,
                    double valor, Status status){

        this.codigo = cod_increment++;
        setPaciente(paciente);
        setMedico(medico);
        setData(LocalDate.now());
        setHora(LocalTime.now());
        setValor(valor);
        setStatus(status);
    }

    public abstract String detalhesConsulta();


    public long getCodigo() {
        return codigo;
    }
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }


    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora(){
        return hora;
    }
    public void setHora(LocalTime hora){
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }


    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }


    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }


    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

}