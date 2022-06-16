package com.example.customarrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class CustomMabtoorAdapter extends ArrayAdapter<String>  {

    private String[] arr;
    private Context context;

    public CustomMabtoorAdapter(@NonNull Context context, int resource, @NonNull String[] arr) {
        super(context, resource, arr);
        this.context = context;
        this.arr = arr;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    }
    

    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_mabtoor_custom_layout, parent,false);
        TextView textView=  convertView.findViewById(R.id.textView);
        textView.setText(getItem(position));

        return convertView;
    }
}
