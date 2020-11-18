package com.colin.learning.rps_backend.payloads;

public class GameResult {

    private String ComputerGuess;
    private Winner winner;

    public GameResult(String computerGuess, Winner winner) {
        ComputerGuess = computerGuess;
        this.winner = winner;
    }

    public String getComputerGuess() {
        return ComputerGuess;
    }

    public void setComputerGuess(String computerGuess) {
        ComputerGuess = computerGuess;
    }

    public Winner getWinner() {
        return winner;
    }

    public void setWinner(Winner winner) {
        this.winner = winner;
    }
}
