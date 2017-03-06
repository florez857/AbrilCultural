package com.example.android.abrilcultural;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {


    private ViewPager pager;
    private AdaprterPageView Adaptador;
    private CircleIndicator indicador;
    private ImageButton izquierda,derecha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        izquierda=(ImageButton)findViewById(R.id.left_nav);
        derecha=(ImageButton)findViewById(R.id.right_nav);


        pager=(ViewPager)findViewById(R.id.viewpager);
        Adaptador=new AdaprterPageView(getSupportFragmentManager());
        pager.setAdapter(Adaptador);
        indicador=(CircleIndicator)findViewById(R.id.indicator);
        indicador.setViewPager(pager);
        izquierda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.arrowScroll(View.FOCUS_LEFT);
            }
        });

        derecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.arrowScroll(View.FOCUS_RIGHT);
            }
        });
    }
}
