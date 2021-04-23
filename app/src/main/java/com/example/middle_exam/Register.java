package com.example.middle_exam;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class Register extends Fragment {

    Button action;
    EditText user,pass,add,phone;

    public Register() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        action=view.findViewById(R.id.Click);
        user=view.findViewById(R.id.User);
        pass=view.findViewById(R.id.Pass);
        add=view.findViewById(R.id.address);
        phone=view.findViewById(R.id.Phone);
        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Information.class);
                String a=user.getText().toString();
                String b=pass.getText().toString();
                String ad=add.getText().toString();
                String p=phone.getText().toString();
                i.putExtra("U", a);
                i.putExtra("P", b);
                i.putExtra("A", ad);
                i.putExtra("Ph", p);
                Toast.makeText(getActivity(), "Clicking\n"+a+"\n"+b, Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        return view;
    }
}