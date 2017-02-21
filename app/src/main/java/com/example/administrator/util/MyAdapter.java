package com.example.administrator.util;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.wms_mobile.R;

/**
 * Created by Administrator on 2017/2/20.
 */

public class MyAdapter extends BaseAdapter {

    private  int[] images;
    private String[] menuNames;
    private Context context;

    public MyAdapter(int[] images,String[] menuNames, Context context) {
        this.images = images;
        this.context = context;
        this.menuNames = menuNames;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        int rsid = images[position];
        String name = menuNames[position];
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(R.layout.work_items,null);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.witemimage);
        imageView.setImageResource(rsid);
        TextView textView = (TextView) viewGroup.findViewById(R.id.itemname);
        textView.setText(name);
        textView.setTextColor(Color.BLACK);
        return viewGroup;
    }
}
