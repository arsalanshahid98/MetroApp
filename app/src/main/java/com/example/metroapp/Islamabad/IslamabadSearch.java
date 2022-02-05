package com.example.metroapp.Islamabad;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.metroapp.CommonActivities.DestinationTime;
import com.example.metroapp.CommonActivities.station1Properties;
import com.example.metroapp.Islamabad.IslamabadStationProperties.SaddarStationProperties;
import com.example.metroapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link IslamabadSearch#newInstance} factory method to
 * create an instance of this fragment.
 */
public class IslamabadSearch extends Fragment {

    private Button
            station_saddar = null,
            station_marrir_chowk = null,
            station_liaqat_bagh = null,
            station_committee_chowk = null,
            station_waris_khan = null,
            station_chandni_chowk = null,
            station_rahmanabad = null,
            station_sixth_road = null,
            station_shamsabad = null,
            station_faizabad = null,
            station_ij_principle_road = null,
            station_potohar = null,
            station_khayabane_johar = null,
            station_fiaz_ahmad_fiaz = null,
            station_peshawar_marr = null,
            station_chaman = null,
            station_ibne_sina = null,
            station_katchery = null,
            station_pims = null,
            station_stock_exchange = null,
            station_seventh_avenue = null,
            station_shaheede_millat = null,
            station_parade_ground = null,
            station_pak_secretariat = null,

            search;

    private TextView
            tResult = null,
            textview1,
            textview2;

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

    public IslamabadSearch() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment IslamabadSearch.
     */
    // TODO: Rename and change types and number of parameters
    public static IslamabadSearch newInstance(String param1, String param2) {
        IslamabadSearch fragment = new IslamabadSearch();
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

    //initializing the buttons
    public void initButtons(View view) {
        station_saddar = view.findViewById(R.id.station_saddar);
        station_marrir_chowk = view.findViewById(R.id.station_marrir_chowk);
        station_liaqat_bagh = view.findViewById(R.id.station_liaqat_bagh );
        station_committee_chowk = view.findViewById(R.id.station_committee_chowk );
        station_waris_khan = view.findViewById(R.id.station_waris_khan );
        station_chandni_chowk = view.findViewById(R.id.station_chandni_chowk);
        station_rahmanabad = view.findViewById(R.id.station_rahmanabad);
        station_sixth_road = view.findViewById(R.id.station_sixth_road);
        station_shamsabad = view.findViewById(R.id.station_shamsabad);
        station_faizabad = view.findViewById(R.id.station_faizabad);
        station_ij_principle_road = view.findViewById(R.id.station_ij_principle_road);
        station_potohar = view.findViewById(R.id.station_potohar);
        station_khayabane_johar = view.findViewById(R.id.station_khayabane_johar);
        station_fiaz_ahmad_fiaz = view.findViewById(R.id.station_fiaz_ahmad_fiaz);
        station_peshawar_marr = view.findViewById(R.id.station_peshawar_marr);
        station_chaman = view.findViewById(R.id.station_chaman);
        station_ibne_sina = view.findViewById(R.id.station_ibne_sina);
        station_katchery = view.findViewById(R.id.station_katchery);
        station_pims = view.findViewById(R.id.station_pims);
        station_stock_exchange = view.findViewById(R.id.station_stock_exchange);
        station_seventh_avenue = view.findViewById(R.id.station_seventh_avenue);
        station_shaheede_millat = view.findViewById(R.id.station_shaheede_millat);
        station_parade_ground = view.findViewById(R.id.station_parade_ground);
        station_pak_secretariat = view.findViewById(R.id.station_pak_secretariat);

        search = view.findViewById(R.id.search);
    }

    //initializing text views
    public void initTextViews(View view) {
        tResult = view.findViewById(R.id.tResult);
        textview1 = view.findViewById(R.id.textview1);
        textview2 = view.findViewById(R.id.textview2);
    }

    // station buttons
    public void stationButtons() {

        station_saddar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "3";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_saddar);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @SuppressLint("ResourceAsColor")
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("Saddar");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("Saddar");
                                to();
                                break;
                            case R.id.station:
                                Intent intent = new Intent(getActivity(), SaddarStationProperties.class);
                                startActivity(intent);
                                break;
                        }
                        return true;
                    }
                });
                popup.show(); //showing popup menu
            }
        });

        station_marrir_chowk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "6";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_marrir_chowk);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @SuppressLint("ResourceAsColor")
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("Marrir Chowk");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("Marrir Chowk");
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

        station_liaqat_bagh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "9";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_liaqat_bagh);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("Liaqat Bagh");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("Liaqat Bagh");
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

        station_committee_chowk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "12";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_committee_chowk);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("Committee Chowk");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("Committee Chowk");
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

        station_waris_khan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "15";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_waris_khan);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("Waris Khan");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("Waris Khan");
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

        station_chandni_chowk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "18";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_chandni_chowk);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("Chandni Chowk");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("Chandni Chowk");
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

        station_rahmanabad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "21";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_rahmanabad);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("Rahmanabad");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("Rahmanabad");
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

        station_sixth_road.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "24";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_sixth_road);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("6th Road");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("6th Road");
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

        station_shamsabad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "27";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_shamsabad );

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("Shamsabad");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("Shamsabad");
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

        station_faizabad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "30";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_faizabad);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("Faizabad");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("Faizabad");
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

        station_ij_principle_road.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "32";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_ij_principle_road);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("IJ Principle Road");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("IJ Principle Road");
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

        station_potohar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "36";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_potohar);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("Potohar");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("Potohar");
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

        station_khayabane_johar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "39";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_khayabane_johar);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("Khayaban-e-Johar");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("Khayaban-e-Johar");
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

        station_fiaz_ahmad_fiaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "42";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_fiaz_ahmad_fiaz);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("Fiaz Ahmad Fiaz");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("Fiaz Ahmad Fiaz");
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

        station_peshawar_marr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "45";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_peshawar_marr);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("Peshawar Marr");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("Peshawar Marr");
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

        station_chaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "48";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_chaman);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("Chaman");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("Chaman");
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

        station_ibne_sina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "51";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_ibne_sina);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("Ibn-e-Sina");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("Ibn-e-Sina");
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

        station_katchery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "54";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_katchery);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("Katchery");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("Katchery");
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

        station_pims.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "57";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_pims);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("PIMS");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("PIMS");
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

        station_stock_exchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "60";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_stock_exchange);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("Stock Exchange");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("Stock Exchange");
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

        station_seventh_avenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "63";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_seventh_avenue);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("7th Avenue");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("7th Avenue");
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

        station_shaheede_millat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "66";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_shaheede_millat);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("Shaheed-e-Millat");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("Shaheed-e-Millat");
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

        station_parade_ground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "69";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_parade_ground);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("Parade Ground");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("Parade Ground");
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

        station_pak_secretariat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = tResult.getText().toString();
                string1 = "72";
                tResult.setText(string1);

                //creating instance of popup
                PopupMenu popup = new PopupMenu(getActivity(), station_pak_secretariat);

                //getting popup from xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @SuppressLint("ResourceAsColor")
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fromDestination:
                                textview1.setText("Pak Secretariat");
                                from();
                                break;
                            case R.id.toDestination:
                                textview2.setText("Pak Secretariat");
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_islamabad_search, container, false);

        initButtons(view);
        initTextViews(view);

        stationButtons();

        //search button
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search();
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
        String resultOutput = Math.round(Result) + " Minutes ";
        tResult.setText(String.valueOf(resultOutput));
        isClickEqu=true;
    }

    // search function to display the time in the other page
    public void search() {
        Intent intent = new Intent(getActivity(), DestinationTime.class);
        intent.putExtra("key", tResult.getText().toString());
        startActivity(intent);
    }
}