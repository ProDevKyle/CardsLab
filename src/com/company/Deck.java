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

    public boolean isEmpty()
    {
        return unDealt.size() <= 0;
    }

    public int size(int amount)
    {
        return unDealt.size();
    }

    public Card deal()
    {
        if(this.unDealt.size() <= 0)
        {
            return null;
        }
        Card topCard = this.unDealt.remove(0);
        this.Dealt.add(topCard);
        return topCard;
    }

    public void shuffle()
    {
        System.out.println(this.unDealt);
        for(int i = 0; i < this.Dealt.size()-1; i++)
        {
            this.unDealt.add(this.Dealt.get(i));
        }
        for(int k = this.unDealt.size()-1; k > 0; k--)
        {
            int r = (int)(Math.random() * this.unDealt.size());
            Card temp = this.unDealt.get(k);
            this.unDealt.set(k, this.unDealt.get(r));
            this.unDealt.set(r, temp);
        }

    }
}
