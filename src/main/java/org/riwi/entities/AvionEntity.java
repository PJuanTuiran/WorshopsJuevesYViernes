package org.riwi.entities;

public class AvionEntity {
    int idAvion;
    String modelo;
    int capacidad;

    public AvionEntity(int idAvion, String modelo, int capacidad) {
        this.idAvion = idAvion;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public AvionEntity() {
    }

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
