package edu.tequila.tecmm.gobiernomovil;

import java.io.Serializable;

/**
 * Description:
 * Copyright 2017 TecMM Tequila
 * Created by luiscobian on 3/21/18.
 * Edit by ---- on 3/21/18
 */

public class DtoLogin implements Serializable {

    private String telefono;
    private String pass;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "DtoLogin{" +
                "telefono='" + telefono + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
