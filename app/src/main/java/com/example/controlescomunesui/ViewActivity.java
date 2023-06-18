package com.example.controlescomunesui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

//Autor José Zambrano
public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        TextView txtSaludo=(TextView) findViewById(R.id.twResult);
        Bundle bundle=this.getIntent().getExtras();
        txtSaludo.setText("Cédula: "+bundle.getString("CEDULA")+"\n Nombres: "
                +bundle.getString("NOMBRE")+"\n Género: "+bundle.getString("GENERO")
                +"\n Fecha de Nacimiento: "+bundle.getString("FECHA")+"\n Ciudad: "
                +bundle.getString("CIUDAD")+"\n E-mail: "+bundle.getString("EMAIL")
                +"\n Teléfono: "+bundle.getString("TELEFONO"));
    }

}