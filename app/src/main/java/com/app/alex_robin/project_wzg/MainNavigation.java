package com.app.alex_robin.project_wzg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainNavigation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_navigation);

    }//end onCreate



    public void open_CardDeck(View view){

        //Jumps into Activity CardDeck

        Intent myIntent = new Intent(MainNavigation.this, CardDeck.class);
        MainNavigation.this.startActivity(myIntent);

    }

    public void open_QuoteCollection(View view){

        //Jumps into Activity QuoteCollection

        Intent myIntent = new Intent(MainNavigation.this, QuoteCollection.class);
        MainNavigation.this.startActivity(myIntent);

    }








}
