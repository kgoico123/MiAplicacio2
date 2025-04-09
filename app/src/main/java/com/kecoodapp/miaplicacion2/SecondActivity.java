package com.kecoodapp.miaplicacion2;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kecoodapp.miaplicacion2.adapters.BasicAdapter;
import com.kecoodapp.miaplicacion2.adapters.Color;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.second), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        List<Color> data=new ArrayList<>();
        Color color1 = new Color();
        Color color2 = new Color();
        Color color3 = new Color();
        Color color4 = new Color();
        Color color5 = new Color();
        Color color6 = new Color();
        Color color7 = new Color();
        Color color8 = new Color();
        color1.setName("Amarillo");
        color1.setTel(255255224);
        color2.setName("Azul");
        color2.setTel(2168240);
        color3.setName("Verde");
        color3.setTel(3124021);
        color4.setName("Gris");
        color4.setTel(172180171);
        color5.setName("Rojo");
        color5.setTel(2382945);
        color6.setName("Marron");
        color6.setTel(907172);
        color7.setName("Morado");
        color7.setTel(18243247);
        color8.setName("Negro");
        color8.setTel(000);
        data.add(color1);
        data.add(color2);
        data.add(color3);
        data.add(color4);
        data.add(color5);
        data.add(color6);
        data.add(color7);
        data.add(color8);

        RecyclerView rvBasic =findViewById(R.id.rvBasic);
        rvBasic.setLayoutManager(new LinearLayoutManager(this));
        BasicAdapter adapter =new BasicAdapter(data);
        rvBasic.setAdapter(adapter);

    }
}
