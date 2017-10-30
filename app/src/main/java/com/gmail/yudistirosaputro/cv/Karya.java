package com.gmail.yudistirosaputro.cv;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.gmail.yudistirosaputro.cv.adapter.RecyclerViewAdapterKarya;

import java.util.ArrayList;

public class Karya extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> nama = new ArrayList<>();
    ArrayList<String> deskripsi = new ArrayList<>();
    ArrayList<String> link = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karya);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        link.add("org.rackspira.akakomsiakad");
        link.add("com.rackspira.dompetku");
        link.add("id.overgiga.chato");
        link.add("id.overgiga.asiangames");
        link.add("com.kudkud32.ramalanjodoh");
        link.add("com.rackspira.malingkayu");


        nama.add("Akakom Siakad");
        nama.add("Dompetku");
        nama.add("Chato!");
        nama.add("AsianGames");
        nama.add("Ramalan Jodoh");
        nama.add("Maling Kayu");

        deskripsi.add("Merupakan versi mobile dari Sistem Informasi Akademik dari STMIK AKAKOM Yogyakarta ");
        deskripsi.add("Aplikasi ini bertujuan untuk membantu memanajemen siklus keuangan harian Anda");
        deskripsi.add("Chato! adalah aplikasi Chat Story Berbahasa Indonesia.");
        deskripsi.add("Feel The Experience Of Being Connected in 18th Asian Games 2018.");
        deskripsi.add("Aplikasi ini berisi ramalan kecocokan dan tentang pasangan anda");
        deskripsi.add("Latih kecepatan tanggan mu dalam memotong kayu dan menghindarinya");

        recyclerView = (RecyclerView)findViewById(R.id.rviewKarya);
        recyclerView.setLayoutManager(new LinearLayoutManager(Karya.this, LinearLayoutManager.VERTICAL, false));
        RecyclerViewAdapterKarya adapter = new RecyclerViewAdapterKarya(Karya.this,nama,deskripsi,link);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(Karya.this,MainActivity.class);
        startActivity(intent);
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

        Intent intent = new Intent(Karya.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
