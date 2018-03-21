package edu.tequila.tecmm.gobiernomovil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class OpcionesActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSolicitud)
    public void enviarSolictud() {
        Intent i = new Intent(this,SolicitudActivity.class);
        startActivity(i);
    }
}
