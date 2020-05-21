package com.example.myadapter;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mlayoutManager;

    ArrayList<Animal> animalsList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=findViewById(R.id.listView);



        animalsList.add(new Animal(R.drawable.persian,"Persian cat","Maik"));
        animalsList.add(new Animal(R.drawable.siamese,"Siamese cat","Parki"));
        animalsList.add(new Animal(R.drawable.sibirka,"Siberian cat","Loli"));
        animalsList.add(new Animal(R.drawable.sphynx,"Sphynx cat","Djes"));
        animalsList.add(new Animal(R.drawable.bengalcat,"Bengal cat","Roky"));
        animalsList.add(new Animal(R.drawable.huski,"Husky","Taira"));
        animalsList.add(new Animal(R.drawable.samoed,"Samoyed","Lilly"));



        AnimalListAdapter myAdapter=new AnimalListAdapter(this,R.layout.adapter_view_layout,animalsList);
        listView.setAdapter(myAdapter);
    }
}
