package com.shajt3ch.android_fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.LV_ID);

        String[] name = {"Sun", "Mercury", "Earth", "Mars"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, name);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        Fragment fragment;


        if (position == 0) {

            fragment = new SunFragment();

            FragmentManager fragmentManager = getSupportFragmentManager();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.frag_id, fragment);

            fragmentTransaction.commit();

        } else if (position == 1) {
            fragment = new MercuryFragment();

            getSupportFragmentManager().beginTransaction().replace(R.id.frag_id, fragment).commit();

        } else if (position == 2) {
            fragment = new EarthFragment();

            getSupportFragmentManager().beginTransaction().replace(R.id.frag_id, fragment).commit();

        } else if (position == 3) {
            fragment = new MarsFragment();

            getSupportFragmentManager().beginTransaction().replace(R.id.frag_id, fragment).commit();

        }


    }
}
