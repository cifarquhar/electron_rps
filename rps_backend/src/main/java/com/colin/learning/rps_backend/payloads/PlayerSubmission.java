package com.colin.learning.rps_backend.payloads;

public class PlayerSubmission {

    private String playerChoice;

    public PlayerSubmission(String playerChoice) {
        this.playerChoice = playerChoice;
    }

    public PlayerSubmission() {
    }

    public String getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice(String playerChoice) {
        this.playerChoice = playerChoice;
    }
}
