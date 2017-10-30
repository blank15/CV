package com.gmail.yudistirosaputro.cv.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.ImageView;

import com.gmail.yudistirosaputro.cv.R;

/**
 * Created by Yudis on 10/30/2017.
 */

public class ImageAdapter extends BaseAdapter{
    private Context context;
    public Integer [] gambar ={
        R.drawable.img,R.drawable.img1,R.drawable.img2,R.drawable.img3
    };

    public ImageAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return gambar.length;
    }

    @Override
    public Object getItem(int position) {
        return gambar[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView = new ImageView(context);
        imageView.setImageResource(gambar[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridLayoutManager.LayoutParams(350,350));
        return imageView;
    }
}
