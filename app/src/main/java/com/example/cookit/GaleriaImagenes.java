package com.example.cookit;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GaleriaImagenes extends BaseAdapter {


    private Context context;
    public int[] arregloimagenes={
            R.drawable.aguacate,
            R.drawable.chile,
            R.drawable.frijoles,
            R.drawable.huevo,
            R.drawable.jitomate,
            R.drawable.limon,
            R.drawable.platano,
            R.drawable.res,
            R.drawable.pollo,
            R.drawable.aguacate,
            R.drawable.chile,
            R.drawable.frijoles,
            R.drawable.huevo,
            R.drawable.jitomate,
            R.drawable.limon,
            R.drawable.platano,
            R.drawable.res,
            R.drawable.pollo
    };

    public GaleriaImagenes(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return arregloimagenes.length;
    }

    @Override
    public Object getItem(int position) {
        return arregloimagenes[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(arregloimagenes[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(340,350));

        return imageView;
    }
}
