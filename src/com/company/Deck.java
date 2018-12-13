package com.company;

import java.util.ArrayList;
import java.util.List;

//Challenge Two: Deck Class
public class Deck
{
    List<Card> unDealt;
    List<Card> Dealt;

    public Deck(String[] Rank, String[] Suit, int[] pointValue)
    {
        List<Card> deck = new ArrayList();

        for(int i = 0; i < Suit.length; i++)
        {
            for(int j = 0; j < Rank.length; j++)
            {
                deck.add(new Card(Rank[j] , Suit[i], pointValue[j]));
            }
        }
        this.unDealt = deck;
        this.Dealt = new ArrayList();
    }

    //Challenge Three: Deck Tester
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
        for(int j = this.unDealt.size()-1; j > 0; j--)
        {
            int k = (int)(Math.random() * this.unDealt.size());
            Card temp = this.unDealt.get(j);
            this.unDealt.set(j, this.unDealt.get(k));
            this.unDealt.set(k, temp);
        }
    }
}