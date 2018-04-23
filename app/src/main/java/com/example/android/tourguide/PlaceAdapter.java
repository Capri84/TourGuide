package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Capri on 03.04.2018.
 */

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder> {

    private ArrayList<Place> places;

    public PlaceAdapter(ArrayList<Place> places) {
        this.places = places;
    }

    @Override
    public PlaceAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        PlaceAdapter.ViewHolder viewHolder = new PlaceAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final PlaceAdapter.ViewHolder holder, final int position) {
        Place currentPlace = places.get(position);
        holder.placeImage.setImageResource(currentPlace.getmImageResourceId());
        holder.placeName.setText(currentPlace.getmPlaceName());
        // Getting current place name to use in Share intent
        final String currentPlaceName = currentPlace.getmPlaceName();
        holder.shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Join me at" + " " + currentPlaceName + "!");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Visit this place!");
                if (shareIntent.resolveActivity(v.getContext().getPackageManager()) != null) {
                    v.getContext().startActivity(shareIntent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView placeImage;
        TextView placeName;
        Button shareButton;

        public ViewHolder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card_view);
            placeImage = itemView.findViewById(R.id.img_place);
            placeName = itemView.findViewById(R.id.tv_place_name);
            shareButton = itemView.findViewById(R.id.btn_share);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    Intent placeInfoIntent = new Intent(v.getContext(), PlaceInfoActivity.class);
                    placeInfoIntent.putExtra("position", position);
                    v.getContext().startActivity(placeInfoIntent);
                }
            });
        }
    }
}
