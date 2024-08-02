package org.riwi.entities;

public class PasajeroEntity {

    int idPasajero;
    String nombre;
    String apellido;
    String documentoEntidad;

    public PasajeroEntity(int idPasajero, String nombre, String apellido, String documentoEntidad) {
        this.idPasajero = idPasajero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoEntidad = documentoEntidad;
    }

    public PasajeroEntity() {
    }

    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumentoEntidad() {
        return documentoEntidad;
    }

    public void setDocumentoEntidad(String documentoEntidad) {
        this.documentoEntidad = documentoEntidad;
    }
}
