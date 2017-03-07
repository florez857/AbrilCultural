package com.example.android.abrilcultural;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class Detalle extends AppCompatActivity {
  private Toolbar toolbar;
  private TextView tipo,titulo,descripcion,fecha,organiza,lugar;
   private Bundle contenedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Cultura salta ");
        tipo=(TextView)findViewById(R.id.detalle_exposicion);
        titulo=(TextView)findViewById(R.id.detalle_titulo);
        descripcion=(TextView)findViewById(R.id.detalle_descripcion);
        fecha=(TextView)findViewById(R.id.detalle_fecha);
        organiza=(TextView)findViewById(R.id.detalle_organiza);
        lugar=(TextView)findViewById(R.id.detalle_lugar);
        contenedor=getIntent().getExtras();
         tipo.setText( contenedor.getString("tipo"));
         titulo.setText( contenedor.getString("titulo"));
         descripcion.setText( contenedor.getString("descripcion"));
         fecha.setText(contenedor.getString("fecha"));
         organiza.setText(contenedor.getString("organiza"));
         lugar.setText(contenedor.getString("lugar"));
        //toolbar.setNavigationIcon(R.mipmap.ic_launcher);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setLogo(R.mipmap.ic_launcher);







    }


}
