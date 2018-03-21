package edu.tequila.tecmm.gobiernomovil;

import java.io.Serializable;

/**
 * Description:
 * Copyright 2017 TecMM Tequila
 * Created by luiscobian on 3/21/18.
 * Edit by ---- on 3/21/18
 */

public class DtoSolicitud implements Serializable {

    private int idContribuyente;
    private String tipo;
    private int idgiro;
    private String especs;
    private String calle;
    private int exte;
    private int inte;
    private String colonia;
    private String ciudad;
    private String cp;
    private String geolocalizacion;
    private String direccion;
    private String desde;

    public int getIdContribuyente() {
        return idContribuyente;
    }

    public void setIdContribuyente(int idContribuyente) {
        this.idContribuyente = idContribuyente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdgiro() {
        return idgiro;
    }

    public void setIdgiro(int idgiro) {
        this.idgiro = idgiro;
    }

    public String getEspecs() {
        return especs;
    }

    public void setEspecs(String especs) {
        this.especs = especs;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getExte() {
        return exte;
    }

    public void setExte(int exte) {
        this.exte = exte;
    }

    public int getInte() {
        return inte;
    }

    public void setInte(int inte) {
        this.inte = inte;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getGeolocalizacion() {
        return geolocalizacion;
    }

    public void setGeolocalizacion(String geolocalizacion) {
        this.geolocalizacion = geolocalizacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDesde() {
        return desde;
    }

    public void setDesde(String desde) {
        this.desde = desde;
    }
}
