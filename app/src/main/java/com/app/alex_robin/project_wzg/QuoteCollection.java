package com.app.alex_robin.project_wzg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;

public class QuoteCollection extends AppCompatActivity {


    LinearLayout layout_quote_list;
    LinearLayout layout_add_button;
    LinearLayout layout_input;
    LinearLayout layout_save;

    ListView quote_list ;

    ArrayList quotes;
    ArrayAdapter<String> adapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote_collection);


        //initialize the layouts

        layout_quote_list = (LinearLayout) findViewById(R.id.layout_quote_list);
        layout_add_button = (LinearLayout) findViewById(R.id.layout_add_button);
        layout_input = (LinearLayout) findViewById(R.id.layout_input);
        layout_save = (LinearLayout) findViewById(R.id.layout_save);

        quote_list = (ListView) findViewById(R.id.quote_list);


        //load all quotes

        quotes = new ArrayList<String>();

        //testQuotes

        quotes.add("Zitat: quote1\nVon: testA");
        quotes.add("Zitat: quote2\nVon: testB");




         adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, quotes);

        quote_list.setAdapter(adapter);

    }


    public void show_input_box(View view){
        //shows the inputboxes

        layout_add_button.setVisibility(View.GONE);
        layout_input.setVisibility(View.VISIBLE);
        layout_save.setVisibility(View.VISIBLE);
    }


    public void save_quote(View view){

        EditText input_quote = (EditText) findViewById(R.id.input_quote);
        EditText input_author = (EditText) findViewById(R.id.input_author);

        //save quote

        String quote = input_quote.getText()+"\n"+input_author.getText();


        quotes.add(quote);
        adapter.notifyDataSetChanged();



        //hides the inputboxes

        layout_add_button.setVisibility(View.VISIBLE);
        layout_input.setVisibility(View.GONE);
        layout_save.setVisibility(View.GONE);

    }


}
