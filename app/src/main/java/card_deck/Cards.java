package card_deck;

import com.app.alex_robin.project_wzg.R;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Robin on 28.04.2016.
 */
public class Cards {
    private ArrayList<Integer> cards = new ArrayList<>();

    public Cards() {
        addCards();
    }

    private void addCards() {
        cards.add(R.drawable.clubs_2);
        cards.add(R.drawable.clubs_3);
        cards.add(R.drawable.clubs_4);
        cards.add(R.drawable.clubs_5);
        cards.add(R.drawable.clubs_6);
        cards.add(R.drawable.clubs_7);
        cards.add(R.drawable.clubs_8);
        cards.add(R.drawable.clubs_9);
        cards.add(R.drawable.clubs_10);
        cards.add(R.drawable.clubs_jack);
        cards.add(R.drawable.clubs_queen);
        cards.add(R.drawable.clubs_king);
        cards.add(R.drawable.clubs_ace);
        cards.add(R.drawable.diamonds_2);
        cards.add(R.drawable.diamonds_3);
        cards.add(R.drawable.diamonds_4);
        cards.add(R.drawable.diamonds_5);
        cards.add(R.drawable.diamonds_6);
        cards.add(R.drawable.diamonds_7);
        cards.add(R.drawable.diamonds_8);
        cards.add(R.drawable.diamonds_9);
        cards.add(R.drawable.diamonds_10);
        cards.add(R.drawable.diamonds_jack);
        cards.add(R.drawable.diamonds_queen);
        cards.add(R.drawable.diamonds_king);
        cards.add(R.drawable.diamonds_ace);
        cards.add(R.drawable.hearts_2);
        cards.add(R.drawable.hearts_3);
        cards.add(R.drawable.hearts_4);
        cards.add(R.drawable.hearts_5);
        cards.add(R.drawable.hearts_6);
        cards.add(R.drawable.hearts_7);
        cards.add(R.drawable.hearts_8);
        cards.add(R.drawable.hearts_9);
        cards.add(R.drawable.hearts_10);
        cards.add(R.drawable.hearts_jack);
        cards.add(R.drawable.hearts_queen);
        cards.add(R.drawable.hearts_king);
        cards.add(R.drawable.hearts_ace);
        cards.add(R.drawable.spades_2);
        cards.add(R.drawable.spades_3);
        cards.add(R.drawable.spades_4);
        cards.add(R.drawable.spades_5);
        cards.add(R.drawable.spades_6);
        cards.add(R.drawable.spades_7);
        cards.add(R.drawable.spades_8);
        cards.add(R.drawable.spades_9);
        cards.add(R.drawable.spades_10);
        cards.add(R.drawable.spades_jack);
        cards.add(R.drawable.spades_queen);
        cards.add(R.drawable.spades_king);
        cards.add(R.drawable.spades_ace);
    }

    public int nextCard() {
        if (cards.size() != 0) {
            Random rand = new Random();
            int x = rand.nextInt(cards.size());
            int card = cards.get(x);
            cards.remove(x);
            return card;
        } else {
            addCards();
            return R.drawable.cardback;
        }
    }
}
