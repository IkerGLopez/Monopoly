package edu.ncsu.monopoly;
//I have added a comment MODIFICADO 26/09 OTRO CAMBIO 2
public abstract class Card {

    public static final int TYPE_CHANCE = 1;
    public static final int TYPE_CC = 2;

    public abstract String getLabel();
    public abstract void applyAction();
    public abstract int getCardType();
    //rdr
}
