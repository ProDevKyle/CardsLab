package com.company;

import java.util.ArrayList;
import java.util.List;

//Challenge Two: Deck Class
public class Deck
{
    ArrayList<Card> unDealt;
    ArrayList<Card> Dealt;

    public Deck(String[] rank, String[] suit, int[] pointValue)
    {
        List<Card> deck = new ArrayList<Card>();

        for(int i = 0; i < rank.length; i++)
        {
            for(int j = 0; i < suit.length; i++)
            {
                deck.add(new Card(rank[j], suit[i], pointValue[j]));
            }
        }
    }
}
