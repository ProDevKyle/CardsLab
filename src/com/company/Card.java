package com.company;

//Challenge One: Card Class
public class Card
{
    String rank;
    String suit;
    int pointValue;

    public Card(String rank, String suit, int pointValue)
    {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    public String getRank()
    {
        return this.rank;
    }

    public String getSuit()
    {
        return this.suit;
    }

    public int getPointValue()
    {
        return this.pointValue;
    }

    public boolean equals(Card otherCard)
    {
        return (this.pointValue == otherCard.pointValue);
    }

    public String toString()
    {
        return (this.rank + this.suit + this.pointValue);
    }
}
