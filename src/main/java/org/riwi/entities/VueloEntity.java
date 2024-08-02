package org.riwi.entities;

import java.sql.Time;
import java.util.Date;

public class VueloEntity {

    int idVuelo;

    String destino;
    Date fechaSalida;
    Time horaSalida;
    int idAvion;

    public VueloEntity(int idVuelo, String destino, Date fechaSalida, int idAvion, Time horaSalida) {
        this.idVuelo = idVuelo;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.idAvion = idAvion;
        this.horaSalida = horaSalida;
    }

    public VueloEntity() {
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Time getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }
}
