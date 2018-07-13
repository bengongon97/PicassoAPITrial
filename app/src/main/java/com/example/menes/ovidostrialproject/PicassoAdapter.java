package com.example.menes.ovidostrialproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PicassoAdapter extends ArrayAdapter {


        public PicassoAdapter(Context context, ArrayList<ImageObject> imageList) {
            super(context, 0, imageList);
        }


        public View getView(int position, View convertView, ViewGroup parent) {

            final ImageObject image = (ImageObject) getItem(position);
            // Get the data item for this position
            // final Task task = (Task) getItem(position);

            // Check if an existing view is being reused, otherwise inflate the view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.imageview, parent, false);
            }
            // Lookup view for data population

            ImageView imageView = convertView.findViewById(R.id.imageView);



            Picasso.get()
                    .load(image.getUrl())
                    .error(R.drawable.error)
                    .into(imageView);

            // Populate the data into the template view using the data object


            // Return the completed view to render on screen
            return convertView;

        }
    }

