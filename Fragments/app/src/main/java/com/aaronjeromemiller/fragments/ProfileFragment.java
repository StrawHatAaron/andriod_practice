package com.aaronjeromemiller.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by aaronmiller on 7/25/17.
 */

public class ProfileFragment extends Fragment {
    private static final String TAG = "FoodFragment";

    private Button btnNavFragFood;
    private Button btnNavFragHome;
    private Button btnNavFragProfile;
    private Button btnNavSecondActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.profile_fragment, container, false);
        btnNavFragFood = (Button) view.findViewById(R.id.btnNavFragFood);
        btnNavFragHome = (Button) view.findViewById(R.id.btnNavFragHome);
        btnNavFragProfile = (Button) view.findViewById(R.id.btnNavFragProfile);
        btnNavSecondActivity = (Button) view.findViewById(R.id.btnNavSecondActivity);
        Log.d(TAG, "OnCreatView has started");

        btnNavFragFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to Food Fragment", Toast.LENGTH_LONG).show();
                //navigate to fragment method (below give access to any method that is in main activity (only when method is public))
                ((MainActivity)getActivity()).setViewPager(0);

            }
        });
        btnNavFragHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to Home Fragment", Toast.LENGTH_LONG).show();
                //navigate to fragment method (below give access to any method that is in main activity (only when method is public))
                ((MainActivity)getActivity()).setViewPager(1);

            }
        });
        btnNavFragProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to Profile Fragment", Toast.LENGTH_LONG).show();
                //navigate to fragment method (below give access to any method that is in main activity (only when method is public))
                ((MainActivity)getActivity()).setViewPager(2);

            }
        });
        btnNavSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to Second Acitvity", Toast.LENGTH_LONG).show();
                //Use the intent to go to second activity
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
