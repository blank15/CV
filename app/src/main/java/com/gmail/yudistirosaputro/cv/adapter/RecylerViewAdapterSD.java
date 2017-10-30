package com.gmail.yudistirosaputro.cv.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.amulyakhare.textdrawable.TextDrawable;
import com.amulyakhare.textdrawable.util.ColorGenerator;
import com.gmail.yudistirosaputro.cv.R;

import java.util.ArrayList;

/**
 * Created by Yudis on 10/29/2017.
 */

public class RecylerViewAdapterSD extends RecyclerView.Adapter<RecylerViewAdapterSD.Holder> {

    Context context;
    ArrayList<String> namaSekolah;
    ArrayList<String> tahunSekolah;

    public RecylerViewAdapterSD(Context context, ArrayList<String> namaSekolah, ArrayList<String> tahunSekolah) {
        this.context = context;
        this.namaSekolah = namaSekolah;
        this.tahunSekolah = tahunSekolah;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new Holder(LayoutInflater.from(context).inflate(R.layout.list_sekolah, parent, false));

    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
            holder.textViewNama.setText(namaSekolah.get(position));
            holder.textViewTahun.setText(tahunSekolah.get(position));

            ColorGenerator generator = ColorGenerator.MATERIAL;
            int color1 = generator.getRandomColor();
            TextDrawable drawable1 = TextDrawable.builder()
                .buildRound(namaSekolah.get(position).substring(0,3), color1);
            holder.imageView.setImageDrawable(drawable1);
    }

    @Override
    public int getItemCount() {
        return namaSekolah.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
            TextView textViewNama;
            TextView textViewTahun;
            ImageView imageView;
        public Holder(View itemView) {
            super(itemView);
            textViewNama = (TextView)itemView.findViewById(R.id.textNamaSekolah);
            textViewTahun = (TextView)itemView.findViewById(R.id.textTahunSekolah);
            imageView = (ImageView)itemView.findViewById(R.id.imgHuruf);
        }
    }
}
