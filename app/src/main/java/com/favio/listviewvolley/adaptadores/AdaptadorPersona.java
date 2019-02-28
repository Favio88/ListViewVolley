package com.favio.listviewvolley.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.favio.listviewvolley.R;
import com.favio.listviewvolley.modelos.Persona;
import com.favio.listviewvolley.modelos.Persona;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorPersona extends BaseAdapter {

    List<Persona> listaPersonas;
    Context c;

    public AdaptadorPersona(List<Persona>listaPersonas, Context c){

        this.listaPersonas=listaPersonas;
        this.c=c;
    };

    @Override
    public int getCount() {
        return listaPersonas.size();
    }

    @Override
    public Object getItem(int position) {
        return listaPersonas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listaPersonas.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v=convertView;

        //LayoutInflater linflater=LayoutInflater.from(c);
        //convertView=(View)linflater(R.layout.layout_persona,null)

        if(v==null){
            v=LayoutInflater.from(c).inflate(R.layout.layout_persona,null);
        }

        Persona persona=(Persona) listaPersonas.get(position);

        TextView tv_nombre=(TextView) v.findViewById(R.id.tv_nombre);
        tv_nombre.setText(persona.getNombre());

        TextView tv_sexo=(TextView) v.findViewById(R.id.tv_apellido);
        tv_sexo.setText(persona.getApellido());

        TextView tv_edad=(TextView) v.findViewById(R.id.tv_edad);
        tv_edad.setText(String.valueOf(persona.getEdad()));
        //tv_edad.setText(persona.getEdad().toString());

        return v;
    }
}
