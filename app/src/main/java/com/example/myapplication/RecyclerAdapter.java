package com.example.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.Holder> {

ArrayList<Evento> listadeDatos;

    public RecyclerAdapter(ArrayList<Evento> listadeDatos) {
        this.listadeDatos = listadeDatos;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemlist,null,false);
        return  new  Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
        holder.asignarDatos(listadeDatos.get(i)) ;
    }

    @Override
    public int getItemCount() {
        return listadeDatos.size();
    }

    public class Holder extends RecyclerView.ViewHolder{

        TextView texto1 , texto2;


        public Holder(@NonNull View itemView) {
            super(itemView);
            texto1 = itemView.findViewById(R.id.NombreAccion);
            texto2 =itemView.findViewById(R.id.DescripcionAccion);
        }

        public void asignarDatos(Evento s) {
            texto1.setText(s.getTitulo());

            texto2.setText(s.getDescripcion());
        }
    }

}
