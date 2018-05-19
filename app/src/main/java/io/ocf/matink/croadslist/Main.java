package io.ocf.matink.croadslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TOP PRIORITY: change plus in circle to regular plus ffs
        //get rid of top "croadslist" bar or change color u lazy fucks
    }

    public void open_listings(View view) {
        setContentView(R.layout.activity_main);
    }

    public void open_chat(View view) {
        setContentView(R.layout.chat_screen);
    }

    public void open_profile(View view) {
        setContentView(R.layout.myprofile_screen);
        findViewById(R.id.gear_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_settings(v);
            }
        });
        findViewById(R.id.my_listings_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_my_listings(v);
            }
        });
        findViewById(R.id.transaction_history_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_transaction_history(v);
            }
        });
    }

    public void open_settings(View view) {
        startActivity(new Intent(this, SettingsActivity.class));
    }

    public void open_my_listings(View view) {
        startActivity(new Intent(this, MyListingsActivity.class));
    }

    public void open_transaction_history(View view) {
        startActivity(new Intent(this, TransactionHistoryActivity.class));
    }
}