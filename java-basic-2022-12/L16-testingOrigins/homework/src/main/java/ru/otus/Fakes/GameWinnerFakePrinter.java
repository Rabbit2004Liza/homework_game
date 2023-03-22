package ru.otus.Fakes;

import ru.otus.game.GameWinnerPrinter;
import ru.otus.game.Player;

import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.PrintStream;

public class GameWinnerFakePrinter implements GameWinnerPrinter {
    @Override
    public void printWinner(Player winner) {
        System.out.printf(winner.getName());
    }
}
