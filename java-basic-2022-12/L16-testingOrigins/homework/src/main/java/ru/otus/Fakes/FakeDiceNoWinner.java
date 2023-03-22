package ru.otus.Fakes;

import ru.otus.game.Dice;

public class FakeDiceNoWinner implements Dice {
    @Override
    public int roll() {
        return 2;
    }
}
