package com.example.controlescomunesui;

import static java.lang.Boolean.FALSE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

//Autor José Zambrano
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bLimpiar = findViewById(R.id.btLimpiar);

        bLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btlimpiar();
            }
        });
    }
    public void btguardar(View view){
        EditText ced=(EditText) findViewById(R.id.txtCedula);
        EditText nomb=(EditText) findViewById(R.id.txtNombres);
        EditText ciud=(EditText) findViewById(R.id.txtCiudad);
        EditText ema=(EditText) findViewById(R.id.txtEmail);
        EditText fecna=(EditText) findViewById(R.id.txtDate);
        EditText cell=(EditText) findViewById(R.id.txtPhone);
        RadioButton genMasc=(RadioButton) findViewById(R.id.rbMasculino);
        RadioButton genFem=(RadioButton) findViewById(R.id.rbFemenino);

        String genero="";
        genero=(genMasc.isChecked()?"MASCULINO":(genFem.isChecked()?"FEMENINO":"OTRO"));

        Toast.makeText(this.getApplicationContext(),
                "Registro Éxitoso", Toast.LENGTH_LONG).show();

        Intent intent=new Intent(MainActivity.this, ViewActivity.class);
        startActivity(intent);

        Bundle b=new Bundle();
        b.putString("NOMBRE", nomb.getText().toString());
        b.putString("CEDULA", ced.getText().toString());
        b.putString("GENERO", genero);
        b.putString("CIUDAD",ciud.getText().toString());
        b.putString("FECHA", fecna.getText().toString());
        b.putString("EMAIL", ema.getText().toString());
        b.putString("TELEFONO", cell.getText().toString());
        intent.putExtras(b);
        startActivity(intent);
    }
    public void btlimpiar(){
        ((EditText) findViewById(R.id.txtNombres)).setText("");
        ((EditText) findViewById(R.id.txtCedula)).setText("");
        ((EditText) findViewById(R.id.txtCiudad)).setText("");
        ((EditText) findViewById(R.id.txtPhone)).setText("");
        ((EditText) findViewById(R.id.txtEmail)).setText("");
        ((EditText) findViewById(R.id.txtDate)).setText("");
    }
}