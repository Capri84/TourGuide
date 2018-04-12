package com.example.android.tourguide;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlaceFragment extends Fragment {

    public static final String PAGE = "PAGE";
    private int page;

    public static PlaceFragment newInstance(int page) {
        Bundle bundle = new Bundle();
        bundle.putInt(PAGE, page);
        PlaceFragment fragment = new PlaceFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            page = getArguments().getInt(PAGE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.places_list, container,false);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        // specify an adapter (see also next example)
        PlaceAdapter adapter = new PlaceAdapter(getItemPlaceList(page));
        recyclerView = recyclerView.findViewById(R.id.list);
        recyclerView.setAdapter(adapter);
        return recyclerView;
    }

    private ArrayList<Place> getItemPlaceList(int page) {
        if (page == 0) {
            return Data.getQuizzesList(getContext());
        }
        if (page == 1) {
            return Data.getQuestsList(getContext());
        }
        if (page == 2) {
            return Data.getMuseumsList(getContext());
        }
        if (page == 3) {
            return Data.getTheatersList(getContext());
        }
        return null;
    }
}
