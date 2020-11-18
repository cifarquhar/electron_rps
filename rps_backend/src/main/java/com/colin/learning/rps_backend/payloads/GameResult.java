package com.colin.learning.rps_backend.payloads;

public class GameResult {

    private String computerGuess;
    private Winner winner;

    public GameResult(String computerGuess, Winner winner) {
        this.computerGuess = computerGuess;
        this.winner = winner;
    }

    public String getComputerGuess() {
        return computerGuess;
    }

    public void setComputerGuess(String computerGuess) {
        this.computerGuess = computerGuess;
    }

    public Winner getWinner() {
        return winner;
    }

    public void setWinner(Winner winner) {
        this.winner = winner;
    }
}
