package edu.tequila.tecmm.gobiernomovil;

import java.util.List;

import retrofit2.Call;

import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Description:
 * Copyright 2017 TecMM Tequila
 * Created by luiscobian on 3/21/18.
 * Edit by ---- on 3/21/18
 */

public interface RetrofitGobierno {

    @POST("wslogin_t.php")
    Call<DtoRespuesta> getLogin(@Body DtoLogin login);

    @POST("addSolicitud.php")
    Call<DtoRespuesta> addSolicitud(@Body DtoSolicitud solicitud);

    @POST("listaSolicitud.php")
    Call<DtoRespSolicitud> getParking(@Body DtoDatosSolicitud datosSolicitud);

}
