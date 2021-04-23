package com.example.middle_exam;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toolbar;

import java.util.Collections;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

public class Gallery extends Fragment {

    GridView Grid;
    ArrayAdapter adapter;
    String[] data={"Apple","Banana","Kivi","Ananas","Strawberry","Kakao"};

    public Gallery() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        Grid = view.findViewById(R.id.grid);
        adapter=new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, data);
        Grid.setAdapter(adapter);
        Grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(),Image.class);
                i.putExtra("Pos",position);
                startActivity(i);
            }
        });
        return view;
    }
}