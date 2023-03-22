package ru.otus.Fakes;

import ru.otus.game.Dice;

public class DiceFakeSecondWinnerImpl implements Dice {
    public boolean isFirstThrow = true;
    @Override
    public int roll() {
        if (isFirstThrow){
            isFirstThrow = false;
            return 1;
        }
        else {
            return 6;
        }
    }
}
