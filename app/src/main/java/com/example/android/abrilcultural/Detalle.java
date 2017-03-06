package com.example.android.abrilcultural;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class Detalle extends AppCompatActivity {
  private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Cultura salta ");
        //toolbar.setNavigationIcon(R.mipmap.ic_launcher);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setLogo(R.mipmap.ic_launcher);

    }


}
