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
import com.kecoodapp.miaplicacion2.adapters.Contacto;

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



        List<Contacto> data=new ArrayList<>();
        Contacto contacto1 = new Contacto();
        Contacto contacto2 = new Contacto();
        Contacto contacto3 = new Contacto();
        Contacto contacto4 = new Contacto();
        contacto1.setName("Kevin");
        contacto1.setTel(987656787);
        contacto2.setName("David");
        contacto2.setTel(987656899);
        contacto3.setName("Santiago");
        contacto3.setTel(987656678);
        contacto4.setName("Yorbin");
        contacto4.setTel(987656345);
        data.add(contacto1);
        data.add(contacto2);
        data.add(contacto3);
        data.add(contacto4);

        RecyclerView rvBasic =findViewById(R.id.rvBasic);
        rvBasic.setLayoutManager(new LinearLayoutManager(this));
        BasicAdapter adapter =new BasicAdapter(data);
        rvBasic.setAdapter(adapter);

    }
}
