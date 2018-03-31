/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

import java.sql.Time;

/**
 *
 * @author equipo Pocahontas
 */
public class Boleto {

    private String id;
    private String matricula;
    private String marca;
    private String propietario;
    private String trabajador;
    private String horaEntrada;
    private String horaSalida;
    FrameBoleto frb;

    public Boleto() {
        frb = new FrameBoleto();
    }

    public Boleto(String id, String matricula, String marca, String propietario, String trabajador, String horaEntrada, String horaSalida) {
        this.id = id;
        this.matricula = matricula;
        this.marca = marca;
        this.propietario = propietario;
        this.trabajador = trabajador;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        horaSalida = frb.getHoraSalida().getText();
        this.horaSalida = horaSalida;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = frb.getId().getText();
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        matricula = frb.getMatricula().getText();
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        marca = frb.getMarca().getText();
        this.marca = marca;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        propietario = frb.getPropietario().getText();
        this.propietario = propietario;
    }

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        trabajador = frb.getTrabajador().getText();
        this.trabajador = trabajador;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        horaEntrada = frb.getHoraEntrada().getText();
        this.horaEntrada = horaEntrada;
    }

    @Override
    public String toString() {
        return "Boleto{" + "id=" + id + ", matricula=" + matricula + ", marca=" + marca + ", propietario=" + propietario + ", trabajador=" + trabajador + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + '}';
    }

}
