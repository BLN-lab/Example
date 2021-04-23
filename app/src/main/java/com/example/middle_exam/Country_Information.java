package com.example.middle_exam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Country_Information extends AppCompatActivity {

    ImageView img;
    TextView txt;
    int[] src={R.drawable.mongolian,R.drawable.usa,R.drawable.russian};
    String[] Information={"Mongolian: country in East Asia. Its area is roughly equivalent with the historical territory of Outer Mongolia, which is sometimes used to refer to the current state. It is situated between Russia to the north and China to the south, where it neighbours the Inner Mongolia Autonomous Region. Mongolia does not share a border with Kazakhstan, although only 37 kilometres (23 miles) of land owned by Russia and China separate them.",
            "The United States of America (USA): country primarily located in North America. It consists of 50 states, a federal district, five major self-governing territories, 326 Indian reservations, and some minor possessions.[g] At 3.8 million square miles (9.8 million square kilometers), it is the world's third- or fourth-largest country by total area.[c] With a population of more than 328 million people, it is the third most populous country in the world. The national capital is Washington, D.C., and the most populous city is New York City.",
            "Russia: country spanning Eastern Europe and Northern Asia. It is the largest country in the world, covering 17,125,191 square kilometres (6,612,073 sq mi), and encompassing more than one-eighth of the Earth's inhabited land area. Russia extends across eleven time zones, and has borders with sixteen sovereign nations. It has a population of 146.2 million; and is the most populous country in Europe, and the ninth-most populous country in the world. Moscow, the capital, is the largest city in Europe, while Saint Petersburg is the nation's second-largest city and cultural centre. Russians are the largest Slavic and European nation; they speak Russian, the most spoken Slavic language, and the most spoken native language in Europe."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country__information);

        img=findViewById(R.id.img);
        txt=findViewById(R.id.txt);

        int n=getIntent().getIntExtra("Country",0);

        switch (n){
            case 0:{
                img.setImageResource(src[0]);
                txt.setText(Information[0]);
            };break;
            case 1:{
                img.setImageResource(src[1]);
                txt.setText(Information[1]);
            };break;
            case 2:{
                img.setImageResource(src[2]);
                txt.setText(Information[2]);
            };break;
        }
    }
}