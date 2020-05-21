package com.example.myadapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class AnimalListAdapter extends ArrayAdapter<Animal> {
    ArrayList<Animal> animalList = new ArrayList<>();
    private LayoutInflater mcontext;
    int mResource[];



    public AnimalListAdapter(Context context, int textViewResourceId, ArrayList<Animal> objects) {
        super(context,textViewResourceId,objects);
        animalList=objects;
    }


    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v=convertView;
        String animal=getItem(position).getAnimal();
        String name=getItem(position).getName();
        int imageResource=getItem(position).getmImageResource();

         Animal animal1=new Animal(imageResource,animal,name);

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.adapter_view_layout, null);
        TextView textView2 = (TextView) v.findViewById(R.id.textView2);
        TextView textView3 = (TextView) v.findViewById(R.id.textView3);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);

        textView2.setText(animalList.get(position).getAnimal());
        textView3.setText(animalList.get(position).getName());
        imageView.setImageResource(animalList.get(position).getmImageResource());
        return v;



    }
}
