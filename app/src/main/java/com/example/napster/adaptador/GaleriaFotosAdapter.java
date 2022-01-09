package com.example.napster.adaptador;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.ImageView;

import com.example.napster.R;

public class GaleriaFotosAdapter extends BaseAdapter {

    private Context mContext;
    public int []imageArray= {
            R.drawable.atis,
            R.drawable.atis1,
            R.drawable.atis2,
            R.drawable.atis3,
            R.drawable.atis4,
            R.drawable.atis5,
            R.drawable.atis6,
            R.drawable.atis7,
            R.drawable.atis8,
            R.drawable.atis9,
            R.drawable.atis10,
            R.drawable.atis11


    };

    public GaleriaFotosAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView ImageView = new ImageView(mContext);
        ImageView = new ImageView(mContext);
        ImageView.setImageResource(imageArray[position]);
        ImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        ImageView.setLayoutParams(new ViewGroup.LayoutParams( 340,350)) ;

        return ImageView;
    }
}
