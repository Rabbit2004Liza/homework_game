package ru.otus.Fakes;

import ru.otus.game.Dice;

public class DiceFakeFirstWinnerImpl implements Dice {
    public  boolean isFirstThrow = true;
    @Override
    public int roll() {
        if (isFirstThrow){
            isFirstThrow = false;
        return 6;}
        return 1;
    }
}
