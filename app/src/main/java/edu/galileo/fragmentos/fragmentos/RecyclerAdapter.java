package edu.galileo.fragmentos.fragmentos;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by rzurita on 29/02/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    String[] datos1;

    public RecyclerAdapter(String[] datos1){
        this.datos1 = datos1;
        }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlist,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);


        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.datos.setText(datos1[position]);

    }

    @Override
    public int getItemCount() {
        return datos1.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView datos;

        public RecyclerViewHolder(View view){
            super(view);
            datos = (TextView) view.findViewById(R.id.datostemp1);

        }


    }
}
