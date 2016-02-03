package com.example.estacionvl_tc_014.cinestar.Adapters;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.estacionvl_tc_014.cinestar.Models.Movie;
import com.example.estacionvl_tc_014.cinestar.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by EstascionVL-TC-010 on 2/02/16.
 */
public class MovieAdapter extends BaseAdapter{

    Activity activity;
    List<Movie> data;

    public MovieAdapter(Activity activity, List<Movie> data) {
        this.activity = activity;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    //Muestra interfaz
    @Override
    public long getItemId(int position) {
        return position;
    }

    //Aplica el objeto en el view y lo llena
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //obtener el template
        View v = convertView;
        if(v == null)
           v = View.inflate(activity, R.layout.template_movie,null);

        Movie p = data.get(position);

        TextView tittle = (TextView) v.findViewById(R.id.tittle_movie);
        tittle.setText(p.getName());

        TextView calificacion = (TextView) v.findViewById(R.id.txt_star);
        calificacion.setText("" + p.getRating());

        TextView duracion = (TextView) v.findViewById(R.id.txt_time);
        duracion.setText("" + p.getLengthm());

        ImageView img = (ImageView) v.findViewById(R.id.img);





        Picasso.with(activity).load(Uri.parse(p.getUrl())).into(img);

        return v;

    }
}
