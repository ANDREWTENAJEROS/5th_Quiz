package com.android.andrewtenajeros.bugtongbugtong;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class leaderboard extends AppCompatActivity {

    Button button_playAgain, button_changeUsername;
    ListView listView_tally;

    DatabaseHelper databaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        button_playAgain = (Button) findViewById(R.id.button_playagain);
        button_changeUsername = (Button) findViewById(R.id.button_changeusername);

        listView_tally = (ListView) findViewById(R.id.listView_tally);
        databaseHelper = new DatabaseHelper(this);
        populateListView();

        String currentUsername = uicGetSharedPreferenceValue("userInfo", "username");
        button_playAgain.setText("PLAY AGAIN " + currentUsername);

        bugtongs.SCORE = 10;
        bugtongs.questionShown = 0;

        button_playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bugtongs.questionShown=0;
                startActivity(new Intent(leaderboard.this, bugtongActivity.class));
            }
        });

        button_changeUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(leaderboard.this, MainActivity.class));
            }
        });
    }

    public void populateListView(){
        Cursor data = databaseHelper.getData();
        ArrayList<String> listData = new ArrayList<>();
        while(data.moveToNext()){
            listData.add(data.getString(2) + " - " + data.getString(1));
        }

        ListAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listData);
        listView_tally.setAdapter(adapter);
    }

    public String uicGetSharedPreferenceValue(String sharedPrefName, String key){
        SharedPreferences sharedPreferences = getSharedPreferences(sharedPrefName, Context.MODE_PRIVATE);
        String value = sharedPreferences.getString(key, "");
        return value;
    }

    public void clearstats(View view){
        databaseHelper.clearData();
        populateListView();
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(leaderboard.this, MainActivity.class));
    }
}
