package com.gmail.yudistirosaputro.cv.fragmentTabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gmail.yudistirosaputro.cv.R;
import com.gmail.yudistirosaputro.cv.adapter.RecylerViewAdapterSD;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PendidikanFragment extends Fragment {


    RecyclerView recyclerView;
    ArrayList<String> namaSekolah = new ArrayList<>();
    ArrayList<String> tahunSekolah = new ArrayList<>();

    public PendidikanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pendidikan, container, false);
        namaSekolah.add("SD Negeri 7 Baturetno");
        namaSekolah.add("SMP Negeri 2 Baturetno");
        namaSekolah.add("SMK Negeri 1 Girtontro");
        namaSekolah.add("STMIK AKAKOM Yogyakarta");

        tahunSekolah.add("2003-2012");
        tahunSekolah.add("2009-2012");
        tahunSekolah.add("2012-2015");
        tahunSekolah.add("2015-Sekarang");

        recyclerView = (RecyclerView)view.findViewById(R.id.rviewSekolah);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        RecylerViewAdapterSD adapter = new RecylerViewAdapterSD(getContext(),namaSekolah,tahunSekolah);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        return view;
    }

}
