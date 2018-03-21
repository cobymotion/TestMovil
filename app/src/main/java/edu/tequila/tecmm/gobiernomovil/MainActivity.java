package edu.tequila.tecmm.gobiernomovil;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtTelefono)
    EditText edTelefono;
    @BindView(R.id.txtPass)
    EditText edPass;

    public ProgressDialog dialogWaiting;

    DtoRespuesta datas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }


    @OnClick(R.id.btnIniciar)
    public void login() {
        Log.e("Algo", "Entro");
        dialogWaiting = ProgressDialog.show(this,"", "Waiting for data", true);
        Retrofit retrofit = new Retrofit.Builder().baseUrl(getString(R.string.url))
                .addConverterFactory(GsonConverterFactory.create()).build();

        RetrofitGobierno request = retrofit.create(RetrofitGobierno.class);
        DtoLogin datos = new DtoLogin();
        datos.setPass(edPass.getText().toString());
        datos.setTelefono(edTelefono.getText().toString());
        Log.e("Datos",datos.toString());
        Call<DtoRespuesta> requestData = request.getLogin(datos);

        requestData.enqueue(new Callback<DtoRespuesta>() {
            @Override
            public void onResponse(Call<DtoRespuesta> call, Response<DtoRespuesta> response) {
                if (!response.isSuccessful()) {
                    Log.e("RETROFIT", "There is a response but it's wrong " + response.errorBody().toString());
                    return;
                }
                datas = response.body();
                dialogWaiting.dismiss();
                enviarInicio();
            }

            @Override
            public void onFailure(Call<DtoRespuesta> call, Throwable t) {
                Log.e("RETROFIT", "Failed: Retrofit getting datas");
                t.printStackTrace();
            }
        });


    }

    public void enviarInicio() {
        if(datas.getEstado().equals("OK")) {
            Log.e("ACCESO", "Abriendo actividad 2");
            Intent i = new Intent(this, OpcionesActivity.class);
            startActivity(i);
        }
        else
            Toast.makeText(this, datas.getEstado(), Toast.LENGTH_LONG).show();
    }
}
