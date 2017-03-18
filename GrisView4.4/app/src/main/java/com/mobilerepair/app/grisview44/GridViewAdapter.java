package com.mobilerepair.app.grisview44;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Santoshraddi on 21-02-2017.
 */
public class GridViewAdapter extends BaseAdapter {

    private Context mContext;
    private final String[] web;
    private final int[] Imageid;
    View grid;


    public GridViewAdapter(Context context,String[] web,int[] Imageid ) {
        mContext = context;
        this.Imageid = Imageid;
        this.web = web;
    }

    @Override
    public int getCount() {
        return web.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

       // View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.grid_item, null);
            TextView textView = (TextView) grid.findViewById(R.id.text);
            ImageView imageView = (ImageView)grid.findViewById(R.id.image);
            textView.setText(web[position]);
            imageView.setImageResource(Imageid[position]);
        } else {
            grid =(View) convertView;
        }

        return grid;
    }

}
