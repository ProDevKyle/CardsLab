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

    public boolean equals(Card otherCard)
    {
        return (this.pointValue == otherCard.pointValue);
    }

    public String toString()
    {
        return (this.rank + this.suit + this.pointValue);
    }
}
