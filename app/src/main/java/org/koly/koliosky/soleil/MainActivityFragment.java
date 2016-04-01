package org.koly.koliosky.soleil;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        List<String> weatherForecast = new ArrayList<>(Arrays.asList(
                "Today - Sunny - 88 / 63",
                "Tomorrow - Sunny - 88 / 63",
                "Monday - Cloudy - 88 / 63",
                "Tues - Cloudy - 88 / 63",
                "Weds - Cloudy - 88 / 63",
                "Thurs - Cloudy - 88 / 63",
                "Fri - Cloudy - 88 / 63"));


        View rootView = (View) inflater.inflate(R.layout.fragment_main, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.forecast_listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),

                R.layout.list_item_forecast, R.id.list_item_forecast_textview,weatherForecast);



        listView.setAdapter(adapter);
        return rootView;
    }
}
