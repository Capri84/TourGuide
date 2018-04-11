package com.example.android.tourguide;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Capri on 03.04.2018.
 */

public class Data {

    static ArrayList<Place> getQuizzesList(Context context) {
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(context.getString(R.string.club_60_sec), R.drawable.club60secs_1));
        places.add(new Place(context.getString(R.string.mozgoboinya), R.drawable.mozgoboynya_1));
        places.add(new Place(context.getString(R.string.mozgva), R.drawable.mozgva_1));
        places.add(new Place(context.getString(R.string.quizium), R.drawable.quizium_1));
        places.add(new Place(context.getString(R.string.mozgoboy), R.drawable.mozgoboy_1));
        places.add(new Place(context.getString(R.string.quiz_please), R.drawable.quiz_please_1));
        places.add(new Place(context.getString(R.string.izvilium), R.drawable.izvilium_1));
        places.add(new Place(context.getString(R.string.reasonable_people), R.drawable.reasonable_people_1));
        return places;
    }

    static ArrayList<Place> getQuestsList(Context context) {
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(context.getString(R.string.divergent), R.drawable.ic_launcher_background));
        places.add(new Place(context.getString(R.string.superhero), R.drawable.ic_launcher_background));
        places.add(new Place(context.getString(R.string.houdini), R.drawable.ic_launcher_background));
        places.add(new Place(context.getString(R.string.pharao), R.drawable.ic_launcher_background));
        places.add(new Place(context.getString(R.string.one_way_ticket), R.drawable.ic_launcher_background));
        places.add(new Place(context.getString(R.string.mib), R.drawable.ic_launcher_background));
        places.add(new Place(context.getString(R.string.addams_family), R.drawable.ic_launcher_background));
        places.add(new Place(context.getString(R.string.breaking_bad), R.drawable.ic_launcher_background));
        return places;
    }

    static ArrayList<Place> getMuseumsList(Context context) {
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(context.getString(R.string.tretyakov_gallery), R.drawable.ic_launcher_background));
        places.add(new Place(context.getString(R.string.history_museum), R.drawable.ic_launcher_background));
        places.add(new Place(context.getString(R.string.pushkin_museum), R.drawable.ic_launcher_background));
        places.add(new Place(context.getString(R.string.basil_cathedral), R.drawable.ic_launcher_background));
        places.add(new Place(context.getString(R.string.kremlin), R.drawable.ic_launcher_background));
        places.add(new Place(context.getString(R.string.diamond_fund), R.drawable.ic_launcher_background));
        places.add(new Place(context.getString(R.string.polytechnical_museum), R.drawable.ic_launcher_background));
        places.add(new Place(context.getString(R.string.cosmonautics_museum), R.drawable.ic_launcher_background));
        return places;
    }

    static ArrayList<Place> getTheatersList(Context context) {
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(context.getString(R.string.bolshoy_theater), R.drawable.ic_launcher_background));
        places.add(new Place(context.getString(R.string.maliy_theater), R.drawable.ic_launcher_background));
        places.add(new Place(context.getString(R.string.sovremennik_theater), R.drawable.ic_launcher_background));
        places.add(new Place(context.getString(R.string.lenkom_theater), R.drawable.ic_launcher_background));
        places.add(new Place(context.getString(R.string.satiry_theater), R.drawable.ic_launcher_background));
        places.add(new Place(context.getString(R.string.mossoveta_theater), R.drawable.ic_launcher_background));
        places.add(new Place(context.getString(R.string.mayakovsky_theater), R.drawable.ic_launcher_background));
        places.add(new Place(context.getString(R.string.vakhtangova_theater), R.drawable.ic_launcher_background));
        return places;
    }
}
