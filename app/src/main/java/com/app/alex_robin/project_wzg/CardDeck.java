package com.app.alex_robin.project_wzg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import card_deck.Cards;

public class CardDeck extends AppCompatActivity {

    ImageButton cardButton;
    Cards cards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_deck);

        cardButton = (ImageButton) findViewById(R.id.cardButton);
        cards = new Cards();
    }

    public void nextCard(View view){
        cardButton.setImageResource(cards.nextCard());
    }

}
