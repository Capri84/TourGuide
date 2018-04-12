package com.example.android.tourguide;

import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PlaceInfoActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.img_place_info)
    ImageView imgPlaceInfo;
    @BindView(R.id.img_btn_phone)
    ImageButton imgBtnPhone;
    @BindView(R.id.img_btn_map)
    ImageButton imgBtnMap;
    @BindView(R.id.img_btn_site)
    ImageButton imgBtnSite;
    @BindView(R.id.textView)
    TextView tvPlaceAbout;

    int position;

    TypedArray pictures;
    ArrayList<String> placeInfo = new ArrayList<>();
    ArrayList<String> phone = new ArrayList<>();
    ArrayList<String> latitudes = new ArrayList<>();
    ArrayList<String> longitudes = new ArrayList<>();
    ArrayList<String> site = new ArrayList<>();
    ArrayList<String> labels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info);
        ButterKnife.bind(this);
        imgBtnPhone.setOnClickListener(this);
        imgBtnMap.setOnClickListener(this);
        imgBtnSite.setOnClickListener(this);
        Intent placeInfoIntent = getIntent();
        position = placeInfoIntent.getIntExtra("position", -1);
        setPlaceData();
    }

    private void fillArraysQuizzes() {
        Resources res = getResources();
        pictures = res.obtainTypedArray(R.array.place_photos);
        placeInfo = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.quizzes_info)));
        phone = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.quizzes_phones)));
        latitudes = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.quizzes_latitudes)));
        longitudes = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.quizzes_longitudes)));
        site = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.quizzes_sites)));
        labels = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.quizzes_labels)));
    }

    private void setPlaceData() {
        if (MainActivity.currentPage == 0) {
            fillArraysQuizzes();
            imgPlaceInfo.setImageResource(pictures.getResourceId(position, -1));
            tvPlaceAbout.setText(placeInfo.get(position));
        }
        if (MainActivity.currentPage == 1) {
            fillArraysQuizzes();
            imgPlaceInfo.setImageResource(R.drawable.ic_account_balance_wallet_blue_grey_700_24dp);
            tvPlaceAbout.setText("Quests");
        }
        if (MainActivity.currentPage == 2) {
            fillArraysQuizzes();
            imgPlaceInfo.setImageResource(R.drawable.ic_tag_faces_blue_grey_700_24dp);
            tvPlaceAbout.setText("Museums");
        }
        if (MainActivity.currentPage == 3) {
            fillArraysQuizzes();
            imgPlaceInfo.setImageResource(R.drawable.ic_launcher_background);
            tvPlaceAbout.setText("Theaters");
        }
    }

    @OnClick({R.id.img_btn_phone, R.id.img_btn_map, R.id.img_btn_site})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_btn_phone:
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone.get(position), null));
                if (phoneIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(phoneIntent);
                }
                break;
            case R.id.img_btn_map:
                String geoLocation = "geo:0,0?q=" + latitudes.get(position) + "," + longitudes.get(position) + "(" + labels.get(position) + ")";
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoLocation));
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
                break;
            case R.id.img_btn_site:
                Intent siteIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(site.get(position)));
                if (siteIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(siteIntent);
                }
                break;
        }
    }
}
