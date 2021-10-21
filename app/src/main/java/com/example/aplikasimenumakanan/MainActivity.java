package com.example.aplikasimenumakanan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recKuliner;
    private ArrayList<Kuliner> listKuliner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recKuliner = findViewById(R.id.rec_kuliner);
        initData();

        recKuliner.setAdapter(new RangkainKuliner(listKuliner));
        recKuliner.setLayoutManager(new LinearLayoutManager(this));


    }

    private void initData(){
        this.listKuliner = new ArrayList<>();
        listKuliner.add(new Kuliner("Pecel Lele",
                "Rp. 22.000",
                "Pecel Lele spesial + Nasi",
                R.drawable.lelegoreng));

        listKuliner.add(new Kuliner("Ayam Goreng",
                "Rp.15.000",
                "Ayam Goreng + Nasi",
                R.drawable.ayamgoreng));

        listKuliner.add(new Kuliner("Nila Goreng",
                "Rp.35.000",
                "Nila Goreng + Nasi",
                R.drawable.nilagoreng));

        listKuliner.add(new Kuliner("Es Teh Manis",
                "Rp.4.000",
                "Es Teh",
                R.drawable.esteh));

        listKuliner.add(new Kuliner("Es Jeruk Besar",
                "Rp.7.000",
                "Es Jeruk",
                R.drawable.esjeruk));

    }
}