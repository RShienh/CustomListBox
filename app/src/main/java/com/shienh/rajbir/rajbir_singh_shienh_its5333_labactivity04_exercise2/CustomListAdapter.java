package com.shienh.rajbir.rajbir_singh_shienh_its5333_labactivity04_exercise2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static com.shienh.rajbir.rajbir_singh_shienh_its5333_labactivity04_exercise2.R.layout.mylist;

public class CustomListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] mobileName;
    private final Integer[] mobileImage;
    private final Integer[] mobilePrices;
    private final String[] desc;

    public CustomListAdapter(Activity context, String[] mobileName, Integer[] mobileImage, String[] desc, Integer[] mobilePrices) {
        super(context, mylist, mobileName);
        // TODO Auto-generated constructor stub

        this.context = context;
        this.mobileName = mobileName;
        this.mobileImage = mobileImage;
        this.mobilePrices = mobilePrices;
        this.desc = desc;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(mylist, null, true);

        TextView txtTitle = rowView.findViewById(R.id.item);
        ImageView imageView = rowView.findViewById(R.id.icon);
        TextView describe = rowView.findViewById(R.id.txtdesc);
        TextView price = rowView.findViewById(R.id.txtprices);

        txtTitle.setText(mobileName[position]);
        imageView.setImageResource(mobileImage[position]);
        describe.setText(desc[position] + "\n");
        price.setText("Price: $" + String.valueOf(mobilePrices[position]));
        return rowView;

    }

}
