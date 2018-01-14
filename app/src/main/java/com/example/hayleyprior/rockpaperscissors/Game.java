package com.example.hayleyprior.rockpaperscissors;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by hayleyprior on 08/11/2017.
 */

public class Game {

    private String playerMove;
    private String computerMove;
    private Integer playerScore;
    private Integer computerScore;
    private ArrayList<Move> possibleMoves;

    public Game() {
        this.possibleMoves = new ArrayList<>();
        this.playerScore = 0;
        this.computerScore = 0;
        generatePossibleMoves();
    }

    public Integer getPlayerScore() {
        return this.playerScore;
    }

    public Integer getComputerScore() {
        return computerScore;
    }

    public void setPlayerMove(String playerMove) {
        this.playerMove = playerMove;
    }

    public String getPlayerMove() {
        return playerMove;
    }

    public void setComputerMove(String computerMove) {
        this.computerMove = computerMove;
    }

    public void generatePossibleMoves(){
        for(Move move : Move.values()){
            this.possibleMoves.add(move);
        }
    }

    public ArrayList<Move> getPossibleMoves() {
        return new ArrayList<>(possibleMoves);
    }

    public int getNumberOfPossibleMoves() {
        return getPossibleMoves().size();
    }

    public int getRandomIndex(){
        Random rand = new Random();
        int listSize = getNumberOfPossibleMoves();
        int randomIndex = rand.nextInt(listSize);
        return randomIndex;
    }

    public String getMoveAtIndex(int index){
        return this.possibleMoves.get(index).getString();
    }

    public String getRandomMove() {
        int index = getRandomIndex();
        String move = getMoveAtIndex(index);
        return move;
    }

    public String compareMoves(){
        setComputerMove(getRandomMove());
        if(computerMove.equals(playerMove)) {
            return "It's a draw!\n\nYou played: " + playerMove + "\nComputer played: " + computerMove + "\n\n";
        }
        if(computerMove.equals("Rock")&& playerMove.equals("Paper")){
            this.playerScore ++;
            return "You win!\n\nComputer played Rock!\nYou played Paper\n\nPaper wraps Rock!\n\n";
        }
        if(computerMove.equals("Paper") && playerMove.equals("Scissors")){
            this.playerScore ++;
            return "You Win!\n\nComputer played Paper!\nYou played Scissors\n\nScissors cut Paper!\n\n";
        }
        if(computerMove.equals("Scissors") && playerMove.equals("Rock")){
            this.playerScore ++;
            return "You Win!\n\nComputer played Scissors!\nYou played Rock\n\nRock blunts Scissors\n\n";
        }
        else
            computerScore ++;
            return "Sorry you lose!\n\nYou played: " + playerMove + "\nComputer played: " + computerMove + "\n\n" + computerMove + " beats " + playerMove + "\n\n";

    }


}
