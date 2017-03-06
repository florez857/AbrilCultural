package com.example.android.abrilcultural;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by INTEL on 05/03/2017.
 */

public class AdaptadorRecylcer extends RecyclerView.Adapter<AdaptadorRecylcer.Holder> {

    private Context context;
    AdaptadorRecylcer(Context context){
        this.context=context;
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

    }


    @Override
    public int getItemCount() {

        return 10;
    }


    public class Holder extends RecyclerView.ViewHolder {

        public TextView title, sub_title;

        public Holder(View view) {
            super(view);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                      llamar();

                }
            });


            //this.title = (TextView) view.findViewById(R.id.title);
            //this.sub_title = (TextView) view.findViewById(R.id.sub_title);

        }
        public void llamar(){
            Intent intent=new Intent(context,Detalle.class);
            context.startActivity(intent);
        }
    }
}
