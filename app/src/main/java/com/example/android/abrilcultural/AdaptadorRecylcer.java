package com.example.android.abrilcultural;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by INTEL on 05/03/2017.
 */

public class AdaptadorRecylcer extends RecyclerView.Adapter<AdaptadorRecylcer.Holder> {

    private Context context;
    private ArrayList<Evento> list;
    AdaptadorRecylcer(Context context ,ArrayList<Evento> list){
        this.context=context;
        this.list=list;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater mInflater = LayoutInflater.from(parent.getContext());
        ViewGroup mainGroup = (ViewGroup) mInflater.inflate(
                R.layout.item_layout, parent, false);
        return new Holder(mainGroup);
    }
    @Override
    public void onBindViewHolder(Holder holder, int position) {

              holder.tipo.setText(list.get(position).getTipoEvento());
              holder.titulo.setText(list.get(position).getTitulo());
              holder.hora.setText(list.get(position).getHora());
              holder.lugar.setText(list.get(position).getLugar());
              holder.setPosicion(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        public TextView tipo,titulo,hora,lugar;
        public int posicion;
        public void setPosicion(final int  posicion) {
            this.posicion = posicion;
        }

        public Holder(View view ) {
            super(view);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                      llamar(posicion);

                }
            });
            this.posicion=posicion;
            this.tipo = (TextView) view.findViewById(R.id.tipo);
            this.titulo = (TextView) view.findViewById(R.id.titulo);
            this.hora= (TextView) view.findViewById(R.id.hora);
            this.lugar= (TextView) view.findViewById(R.id.lugar);
            //this.sub_title = (TextView) view.findViewById(R.id.sub_title);

        }
        public void llamar(int i){
            Intent intent=new Intent(context,Detalle.class);
            intent.putExtra("tipo",list.get(i).getTipoEvento());
            intent.putExtra("titulo",list.get(i).getTitulo());
            intent.putExtra("descripcion",list.get(i).getDescripcion());
            intent.putExtra("fecha",list.get(i).getDiaSemana()+" "+list.get(i).getDiaMes()+" "+list.get(i).getHora());
            intent.putExtra("organiza",list.get(i).getOrganiza());
            intent.putExtra("lugar",list.get(i).getLugar());
            context.startActivity(intent);
        }
    }
}
