package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView myrecicled;
    private TextView gg;
    RecyclerAdapter adapatador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gg= findViewById(R.id.textView);
        myrecicled = (RecyclerView) findViewById(R.id.recyclerView);
        myrecicled.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        ArrayList<Evento> listadeDatos = new ArrayList<> ();

      /*  String[] arreglo = new String [2] ;
        arreglo[0] = "Contratar empleado";
        arreglo[1]= "se Contratara al empleado por 1 anio";
        listadeDatos.add(arreglo);
*/

        llenaLista(listadeDatos);
        //  if (listadeDatos != null) {
        adapatador = new RecyclerAdapter(listadeDatos);
        myrecicled.setAdapter(adapatador);
    }

    private void llenaLista(ArrayList<Evento> listadeDatos) {
        Evento e1 = new Evento("Contratar Empleado", "Se contrata por 1 anio") ;
        for (int i = 0; i <10 ; i++) {

            listadeDatos.add(e1);
        }
    }
}
