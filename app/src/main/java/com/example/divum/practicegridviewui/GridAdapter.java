package com.example.divum.practicegridviewui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by divum on 7/4/16.
 */
public class GridAdapter extends BaseAdapter {
    private Context context;

    public GridAdapter(MainActivity mainActivity) {
        this.context = mainActivity;


    }

    @Override
    public int getCount() {
        return 15;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {

            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.grid_list_items, null, false);

           // ImageView kmage = (ImageView) view.findViewById(R.id.images);


        }
        return view;

    }
}
