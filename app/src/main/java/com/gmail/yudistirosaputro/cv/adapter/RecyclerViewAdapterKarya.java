package com.gmail.yudistirosaputro.cv.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.amulyakhare.textdrawable.util.ColorGenerator;
import com.gmail.yudistirosaputro.cv.R;

import java.util.ArrayList;

/**
 * Created by Yudis on 10/30/2017.
 */

public class RecyclerViewAdapterKarya extends RecyclerView.Adapter<RecyclerViewAdapterKarya.Holder> {

    Context context;
    ArrayList<String> nama ;
    ArrayList<String> deskripsi;
    ArrayList<String> link;


    public RecyclerViewAdapterKarya(Context context, ArrayList<String> nama, ArrayList<String> deskripsi, ArrayList<String> link) {
        this.context = context;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.link = link;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecyclerViewAdapterKarya.Holder(LayoutInflater.from(context).inflate(R.layout.list_karya, parent, false));
    }

    @Override
    public void onBindViewHolder(Holder holder, final int position) {

        ColorGenerator generator = ColorGenerator.MATERIAL;
        int color1 = generator.getRandomColor();
        holder.textViewNama.setTextColor(color1);
        holder.textViewNama.setText(nama.get(position));
        holder.textViewDeskripsi.setText(deskripsi.get(position));
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String appPackageName = link.get(position);
                try {
                    context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return nama.size();
    }


    public class Holder extends RecyclerView.ViewHolder {

        TextView textViewNama;
        TextView textViewDeskripsi;
        ImageView imageView;

        public Holder(View itemView) {
            super(itemView);
            textViewNama = (TextView)itemView.findViewById(R.id.textNama);
            textViewDeskripsi = (TextView)itemView.findViewById(R.id.textDeskripsi);
            imageView = (ImageView)itemView.findViewById(R.id.imgDownload);

        }
    }
}
