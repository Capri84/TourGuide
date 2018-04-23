package com.example.android.tourguide;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Capri on 03.04.2018.
 */

public class Data {

    // Filling the list of quizzes
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

    // Filling the list of quests
    static ArrayList<Place> getQuestsList(Context context) {
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(context.getString(R.string.divergent), R.drawable.divergent_1));
        places.add(new Place(context.getString(R.string.superhero), R.drawable.superheroes_1));
        places.add(new Place(context.getString(R.string.houdini), R.drawable.houdini_1));
        places.add(new Place(context.getString(R.string.pharao), R.drawable.pharao_1));
        places.add(new Place(context.getString(R.string.one_way_ticket), R.drawable.ticket_1));
        places.add(new Place(context.getString(R.string.mib), R.drawable.mib_1));
        places.add(new Place(context.getString(R.string.addams_family), R.drawable.addams_1));
        places.add(new Place(context.getString(R.string.breaking_bad), R.drawable.breaking_bad_1));
        return places;
    }

    // Filling the list of museums
    static ArrayList<Place> getMuseumsList(Context context) {
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(context.getString(R.string.tretyakov_gallery), R.drawable.tretyakov_1));
        places.add(new Place(context.getString(R.string.history_museum), R.drawable.historical_1));
        places.add(new Place(context.getString(R.string.pushkin_museum), R.drawable.pushkin_museum_1));
        places.add(new Place(context.getString(R.string.basil_cathedral), R.drawable.basil_1));
        places.add(new Place(context.getString(R.string.kremlin), R.drawable.kremlin_1));
        places.add(new Place(context.getString(R.string.diamond_fund), R.drawable.diamond_1));
        places.add(new Place(context.getString(R.string.polytechnical_museum), R.drawable.polytech_1));
        places.add(new Place(context.getString(R.string.cosmonautics_museum), R.drawable.space_1));
        return places;
    }

    // Filling the list of theatres
    static ArrayList<Place> getTheatresList(Context context) {
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(context.getString(R.string.bolshoy_theatre), R.drawable.bolshoi_1));
        places.add(new Place(context.getString(R.string.maliy_theatre), R.drawable.maly_1));
        places.add(new Place(context.getString(R.string.sovremennik_theatre), R.drawable.sovremennik_1));
        places.add(new Place(context.getString(R.string.lenkom_theatre), R.drawable.lenkom_1));
        places.add(new Place(context.getString(R.string.satiry_theatre), R.drawable.satire_1));
        places.add(new Place(context.getString(R.string.mossoveta_theatre), R.drawable.mossovet_1));
        places.add(new Place(context.getString(R.string.mayakovsky_theatre), R.drawable.mayakovsky_1));
        places.add(new Place(context.getString(R.string.vakhtangova_theatre), R.drawable.vakhtangov_1));
        return places;
    }
}
