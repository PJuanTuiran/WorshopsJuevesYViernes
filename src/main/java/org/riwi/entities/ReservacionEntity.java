package org.riwi.entities;

import java.util.Date;

public class ReservacionEntity {
    int idReservacion;
    int idPasajero;
    int idVuelo;
    Date fechaReservacion;
    String asiento;

    public ReservacionEntity(int idReservacion, int idPasajero, int idVuelo, Date fechaReservacion, String asiento) {
        this.idReservacion = idReservacion;
        this.idPasajero = idPasajero;
        this.idVuelo = idVuelo;
        this.fechaReservacion = fechaReservacion;
        this.asiento = asiento;
    }

    public ReservacionEntity() {
    }

    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public Date getFechaReservacion() {
        return fechaReservacion;
    }

    public void setFechaReservacion(Date fechaReservacion) {
        this.fechaReservacion = fechaReservacion;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }
}
