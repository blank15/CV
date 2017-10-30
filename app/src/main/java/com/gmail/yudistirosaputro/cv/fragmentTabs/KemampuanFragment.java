package com.gmail.yudistirosaputro.cv.fragmentTabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gmail.yudistirosaputro.cv.R;
import com.gmail.yudistirosaputro.cv.adapter.RecylerViewAdapterSD;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class KemampuanFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<String> nama = new ArrayList<>();
    ArrayList<String> tahun = new ArrayList<>();

    public KemampuanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kemampuan, container, false);

        nama.add("Java");
        nama.add("Android Studio");
        nama.add("C++");
        nama.add("Contruct 2");
        nama.add("Unity 3d");
        nama.add("Ionic");
        nama.add("Corel Draw");
        nama.add("Serif Draw");

        tahun.add("1,5 tahun");
        tahun.add("1 tahun");
        tahun.add("1 tahun");
        tahun.add("3 tahun");
        tahun.add("0,5  tahun");
        tahun.add("0,5 tahun");
        tahun.add("2 tahun");
        tahun.add("1,5 tahun");


        recyclerView = (RecyclerView)view.findViewById(R.id.rviewKemampuan);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        RecylerViewAdapterSD adapter = new RecylerViewAdapterSD(getContext(),nama,tahun);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        return view;
    }

}
