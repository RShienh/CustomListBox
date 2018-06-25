package com.shienh.rajbir.rajbir_singh_shienh_its5333_labactivity04_exercise2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;

    String[] itemName = {
            "iPhone",
            "Blackberry",
            "Galaxy",
            "Pixel",
            "Motorola",
            "Huawei"
    };

    Integer[] images = {
            R.mipmap.iphone,
            R.mipmap.blackberry,
            R.mipmap.galaxy,
            R.mipmap.pixel,
            R.mipmap.motorola,
            R.mipmap.huawei
    };

    Integer[] prices = {1319, 600, 1100, 1290, 294, 1239};

    String[] desc = {"Our vision has always been to create an iPhone that is entirely screen. One so immersive the device itself disappears into the experience. And so intelligent it can respond to a tap, your voice and even a glance.",
            "Designed to keep up with the most challenging lifestyle, BlackBerry Motion has been made to last longer, go further and work more effortlessly.",
            "The Camera, Re-imagined",
            "The all-new Pixel 2 XL.\n" +
                    "Google inside and out.",
            "meet the razor-thin future of smartphones",
            "HUAWEI's P series has always been a pioneer of smartphone photography. Now the HUAWEI P20 Pro is once again leading the way with the revolutionary Leica Triple Camera, where aesthetic vision meets an advanced camera system that shines a light on intelligent photography."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter adapter = new CustomListAdapter(this, itemName, images, desc, prices);
        list = findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Selecteditem = itemName[+position];
                Toast.makeText(getApplicationContext(), Selecteditem, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
