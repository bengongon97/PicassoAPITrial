package com.example.menes.ovidostrialproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoProvider;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         ArrayList<ImageObject> myList = new ArrayList<>();

        ImageObject obj1 = new ImageObject("Image 1", 21150, "https://www.trialprod.com/3959-large_default/monty-kaizen-220-trials-bike.jpg");
        ImageObject obj2 = new ImageObject("Image 2", 21102, "https://www.islabikes.com/wp-content/uploads/2015/10/Cnoc16-Red-MY2016-SRGB-USA1.jpg");
        ImageObject obj3 = new ImageObject("Image 2", 21102, "asdsadas");

        myList.add(obj1);
        myList.add(obj2);
        myList.add(obj3);

        for (ImageObject obj: myList) {
            String url = obj.getUrl();


            PicassoAdapter adapter = new PicassoAdapter (MainActivity.this, myList);

            ListView  list1 = findViewById(R.id.listView);

            list1.setAdapter(adapter);

        }


    }





}
