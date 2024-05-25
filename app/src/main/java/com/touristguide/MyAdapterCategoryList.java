package com.touristguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyAdapterCategoryList extends ArrayAdapter<String> {

    private final Context context;
    private final ArrayList<String> data;

    public MyAdapterCategoryList(Context context, ArrayList<String> data) {
        super(context, R.layout.category_layout, data);
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Inflate the item_card layout
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.category_layout, parent, false);

        // Get the TextView and ImageView
        TextView textView = view.findViewById(R.id.map_category_name);
        textView.setText(data.get(position));


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyAdapterCategoryList.this.getContext(), "Rent button clicked!" + data.get(position), Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
