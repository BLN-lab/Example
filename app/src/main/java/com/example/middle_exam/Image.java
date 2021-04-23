package com.example.middle_exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Image extends AppCompatActivity {
    ImageView img;
    TextView txt;
    int[] image={R.drawable.download,R.drawable.banana,R.drawable.kivi,R.drawable.ananas_000,R.drawable.strawberry,R.drawable.kakao};
    String[] txts={"An apple is an edible fruit produced by an apple tree (Malus domestica). Apple trees are cultivated worldwide and are the most widely grown species in the genus Malus. The tree originated in Central Asia, where its wild ancestor, Malus sieversii, is still found today. Apples have been grown for thousands of years in Asia and Europe and were brought to North America by European colonists. Apples have religious and mythological significance in many cultures, including Norse, Greek, and European Christian tradition.",
            "A banana is an elongated, edible fruit – botanically a berry[1][2] – produced by several kinds of large herbaceous flowering plants in the genus Musa.[3] In some countries, bananas used for cooking may be called \"plantains\", distinguishing them from dessert bananas. The fruit is variable in size, color, and firmness, but is usually elongated and curved, with soft flesh rich in starch covered with a rind, which may be green, yellow, red, purple, or brown when ripe. The fruits grow in clusters hanging from the top of the plant. Almost all modern edible seedless (parthenocarp) bananas come from two wild species – Musa acuminata and Musa balbisiana. The scientific names of most cultivated bananas are Musa acuminata, Musa balbisiana, and Musa × paradisiaca for the hybrid Musa acuminata × M. balbisiana, depending on their genomic constitution. The old scientific name for this hybrid, Musa sapientum, is no longer used.",
            "Kiwifruit (commonly shortened to kiwi in North America) or Chinese gooseberry is the edible berry of several species of woody vines in the genus Actinidia.[1][2] The most common cultivar group of kiwifruit (Actinidia deliciosa 'Hayward')[3] is oval, about the size of a large hen's egg: 5–8 centimetres (2–3 inches) in length and 4.5–5.5 cm (1 3⁄4–2 1⁄4 in) in diameter. It has a thin, fuzzy, fibrous, tart but edible light brown skin and light green or golden flesh with rows of tiny, black, edible seeds. The fruit has a soft texture with a sweet and unique flavour. In 2018, China produced half of the world total of kiwifruit.",
            "The pineapple[2][3] (Ananas comosus) is a tropical plant with an edible fruit and the most economically significant plant in the family Bromeliaceae.[4] The pineapple is indigenous to South America, where it has been cultivated for many centuries. The introduction of the pineapple to Europe in the 17th century made it a significant cultural icon of luxury. Since the 1820s, pineapple has been commercially grown in greenhouses and many tropical plantations. Further, it is the third most important tropical fruit in world production. In the 20th century, Hawaii was a dominant producer of pineapples, especially for the US; however, by 2016, Costa Rica, Brazil, and the Philippines accounted for nearly one-third of the world's production of pineapples.[5]",
            "The garden strawberry (or simply strawberry; Fragaria × ananassa)[1] is a widely grown hybrid species of the genus Fragaria, collectively known as the strawberries, which are cultivated worldwide for their fruit. The fruit is widely appreciated for its characteristic aroma, bright red color, juicy texture, and sweetness. It is consumed in large quantities, either fresh or in such prepared foods as jam, juice, pies, ice cream, milkshakes, and chocolates. Artificial strawberry flavorings and aromas are also widely used in products such as candy, soap, lip gloss, perfume, and many others.",
            "The cocoa bean or simply cocoa (/ˈkoʊ.koʊ/), which is also called the cacao bean or cacao (/kəˈkaʊ/),[1] is the dried and fully fermented seed of Theobroma cacao, from which cocoa solids (a mixture of nonfat substances) and cocoa butter (the fat) can be extracted. Cocoa beans are the basis of chocolate, and Mesoamerican foods including tejate, an indigenous Mexican drink that also includes maize."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        img=findViewById(R.id.imging);
        txt=findViewById(R.id.info);
        Intent i=getIntent();
        img.setImageResource(image[i.getIntExtra("Pos",0)]);
        txt.setText(txts[i.getIntExtra("Pos",0)]);
    }
}