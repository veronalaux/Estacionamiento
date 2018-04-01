/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

import java.sql.Time;
import javax.swing.JLabel;

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
    private String tarifa;
    FrameBoleto frb;

    public Boleto() {
        frb = new FrameBoleto();
        setId(frb.getId().getText());
        setMatricula();
        setMarca();
        setPropietario();
        setTrabajador();
        setHoraEntrada();
        setHoraSalida();
    }

    public Boleto(String id, String matricula, String marca, String propietario, String trabajador, String horaEntrada, String horaSalida, String tarifa) {
        this.id = id;
        this.matricula = matricula;
        this.marca = marca;
        this.propietario = propietario;
        this.trabajador = trabajador;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.tarifa = tarifa;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida() {
        this.horaSalida = frb.getHoraSalida().getText();
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

    public void setMatricula() {
        this.matricula = frb.getMatricula().getText();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca() {
        this.marca = frb.getMarca().getText();
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario() {
        this.propietario = frb.getPropietario().getText();
    }

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador() {
        this.trabajador = frb.getTrabajador().getText();
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada() {
        this.horaEntrada = frb.getHoraEntrada().getText();
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = frb.getTarifa().getText();
    }

    @Override
    public String toString() {
        return "Boleto{" + "id=" + id + ", matricula=" + matricula + ", marca=" + marca + ", propietario=" + propietario + ", trabajador=" + trabajador + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + ", tarifa=" + tarifa + '}';
    }

}
