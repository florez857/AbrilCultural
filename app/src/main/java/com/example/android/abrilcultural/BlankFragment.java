package com.example.android.abrilcultural;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
  private View view;
  private RecyclerView recyclerView;
  private AdaptadorRecylcer adaptador;
  private ArrayList<Evento> listaEventos;
  private lista list;
  private TextView DiaSemana,dia,mes;
    private  String page;

    public static BlankFragment newInstance(String page) {
        BlankFragment fragmentFirst = new BlankFragment();
        Bundle args = new Bundle();
        args.putString("posicion",page);
        fragmentFirst.setArguments(args);
        fragmentFirst.setRetainInstance(true);
        return fragmentFirst;
    }

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getString("posicion");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =inflater.inflate(R.layout.fragment_blank, container, false);
        DiaSemana=(TextView)view.findViewById(R.id.dia_semana);
        dia=(TextView)view.findViewById(R.id.dia_mes);
        mes=(TextView)view.findViewById(R.id.mes);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        list=new lista();
        listaEventos=list.lista(page);
        dia.setText(listaEventos.get(0).getDiaMes());
        DiaSemana.setText(listaEventos.get(0).getDiaSemana());
        mes.setText(listaEventos.get(0).getMes());

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adaptador = new AdaptadorRecylcer(getActivity(),listaEventos);
        recyclerView.setAdapter(adaptador);
        return view;




    }


}
