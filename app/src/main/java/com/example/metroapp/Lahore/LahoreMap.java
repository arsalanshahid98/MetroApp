package com.example.metroapp.Lahore;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.metroapp.CommonActivities.station1Properties;
import com.example.metroapp.CommonActivities.DestinationTime;
import com.example.metroapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LahoreMap#newInstance} factory method to
 * create an instance of this fragment.
 */

public class LahoreMap extends Fragment {

    //getting buttons from fragments
    private Button button1 = null,
            button2 = null,
            button3 = null,
            go;


    private TextView tResult = null;
    private double num1 = 0, num2 = 0;
    private double Result = 0;
    private int op = 0;
    private boolean isClickEqu=false;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LahoreMap() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LahoreMap.
     */
    // TODO: Rename and change types and number of parameters
    public static LahoreMap newInstance(String param1, String param2) {
        LahoreMap fragment = new LahoreMap();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lahore_map, container, false);

        //initializing the buttons
        button1 = view.findViewById(R.id.button1);
        button2 = view.findViewById(R.id.button2);
        button3 = view.findViewById(R.id.button3);
        tResult = view.findViewById(R.id.tResult);

        go = view.findViewById(R.id.go);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go();
            }
        });

        //button1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "100";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), button1);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                from();
                                break;
                            case R.id.toDestination:
                                to();
                                break;
                            case R.id.station:
                                Intent intent = new Intent(getActivity(), station1Properties.class);
                                startActivity(intent);
                                break;
                        }
                        return true;
                    }
                });
                popup.show(); //showing popup menu
            }
        });

        //button 2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String string2 = tResult.getText().toString();
                string2 = "165";
                tResult.setText(string2);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), button2);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                from();
                                break;
                            case R.id.toDestination:
                                to();
                                break;
                            case R.id.station:
                                Intent intent = new Intent(getActivity(), station1Properties.class);
                                startActivity(intent);
                                break;
                        }

                        return true;
                    }
                });
                popup.show(); //showing popup menu
            }
        });

        //button 3
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String string2 = tResult.getText().toString();
                string2 = "265";
                tResult.setText(string2);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), button3);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                from();
                                break;
                            case R.id.toDestination:
                                to();
                                break;
                            case R.id.station:
                                Intent intent = new Intent(getActivity(), station1Properties.class);
                                startActivity(intent);
                                break;
                        }
                        return true;
                    }
                });
                popup.show(); //showing popup menu
            }
        });
        return view;
    }

    //from function to take the from value into the from button
    public void from() {
        String myStringSub = tResult.getText().toString();
        num1=Double.valueOf(myStringSub);
        tResult.setText(null);
        op=2;
        isClickEqu=false;
    }

    //to function to take the second value and subtract the two buttons
    public void to() {
        String myStringEqu = tResult.getText().toString();
        num2=Double.valueOf(myStringEqu);
        tResult.setText(null);
        Result = num1 - num2;
        Result = Math.abs(Result);
        String resultOutput = Math.round(Result/60) + " Hours " + Math.round(Result%60) + " Minutes ";
        tResult.setText(String.valueOf(resultOutput));
        isClickEqu=true;
    }

    public void go() {
        Intent intent = new Intent(getActivity(), DestinationTime.class);
        intent.putExtra("key", tResult.getText().toString());
        startActivity(intent);
    }
}