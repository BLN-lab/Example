package com.example.middle_exam;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Countries extends Fragment {

    ListView list;
    ArrayAdapter<String> adapter;
    String[] country={"Mongol","USA","Russia"};

    public Countries() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_countries, container, false);
        list=view.findViewById(R.id.List);
        adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,country);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i= new Intent(getActivity(),Country_Information.class);
                i.putExtra("Country",position);
                startActivity(i);
            }
        });
        return view;
    }
}