package edu.tequila.tecmm.gobiernomovil;

import java.io.Serializable;

/**
 * Description:
 * Copyright 2017 TecMM Tequila
 * Created by luiscobian on 3/21/18.
 * Edit by ---- on 3/21/18
 */

public class DtoDatosSolicitud implements Serializable {

    private int idtitular;
    private int idsolicitud;

    public int getIdtitular() {
        return idtitular;
    }

    public void setIdtitular(int idtitular) {
        this.idtitular = idtitular;
    }

    public int getIdsolicitud() {
        return idsolicitud;
    }

    public void setIdsolicitud(int idsolicitud) {
        this.idsolicitud = idsolicitud;
    }
}
