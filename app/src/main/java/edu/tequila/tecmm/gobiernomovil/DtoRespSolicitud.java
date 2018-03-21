package edu.tequila.tecmm.gobiernomovil;

import java.io.Serializable;

/**
 * Description:
 * Copyright 2017 TecMM Tequila
 * Created by luiscobian on 3/21/18.
 * Edit by ---- on 3/21/18
 */

public class DtoRespSolicitud implements Serializable {

    private String noLicencia;
    private String estado;
    private String fechaRevision;
    private String tipo;
    private String direccion;
    private String fechaRecepcion;
    private String reviso;

    public String getNoLicencia() {
        return noLicencia;
    }

    public void setNoLicencia(String noLicencia) {
        this.noLicencia = noLicencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(String fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(String fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public String getReviso() {
        return reviso;
    }

    public void setReviso(String reviso) {
        this.reviso = reviso;
    }
}
