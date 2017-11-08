package com.example.hayleyprior.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

/**
 * Created by hayleyprior on 08/11/2017.
 */

public class GameTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void canGenerateMoves() throws Exception {
        assertEquals(3, game.getNumberOfPossibleMoves());
    }

    @Test
    public void getMoveFromIndex() throws Exception {
        assertEquals("Rock", game.getMoveAtIndex(0));
    }

    @Test
    public void getRandomMove() throws Exception {
        Game spy = Mockito.spy(new Game());
        Mockito.when(spy.getRandomIndex()).thenReturn(1);
        assertEquals("Paper", spy.getRandomMove());
    }

    @Test
    public void canUpdatePlayerMove() throws Exception {
        String move = game.getMoveAtIndex(0);
        game.setPlayerMove(move);
        assertEquals("Rock", game.getPlayerMove());
    }

    @Test
    public void compareWin() throws Exception {
        Game spy = Mockito.spy(new Game());
        Mockito.when(spy.getRandomMove()).thenReturn("Scissors");
        spy.setPlayerMove("Rock");
        assertEquals("You Win!\n\nComputer played Scissors!\nYou played Rock\n\nRock blunts Scissors", spy.compareMoves());
    }

    @Test
    public void compareLose() throws Exception {
        Game spy = Mockito.spy(new Game());
        Mockito.when(spy.getRandomMove()).thenReturn("Scissors");
        spy.setPlayerMove("Paper");
        assertEquals("Sorry you lose!\n\nYou played: Paper\nComputer played: Scissors\n\nScissors beats Paper", spy.compareMoves());
    }
}