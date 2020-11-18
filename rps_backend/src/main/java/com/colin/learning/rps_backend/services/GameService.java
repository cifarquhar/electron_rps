package com.colin.learning.rps_backend.services;

import com.colin.learning.rps_backend.payloads.Winner;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Random;

@Service
public class GameService {

    private Random randomGenerator;
    private String[] options;
    private HashMap<String, String> winningCombinations;

    public GameService() {
        randomGenerator = new Random();
        options = new String[]{"rock", "paper", "scissors"};
        winningCombinations = new HashMap<>();
        winningCombinations.put("rock", "scissors");
        winningCombinations.put("scissors", "paper");
        winningCombinations.put("paper", "rock");
    }

    public String getComputerChoice(){
        int index = randomGenerator.nextInt(3);
        return options[index];
    }

    public Winner getWinner(String playerChoice, String computerChoice){
        if (playerChoice.equals(computerChoice)){
            return Winner.DRAW;
        }
        else if(winningCombinations.get(playerChoice).equals(computerChoice)){
            return Winner.PLAYER;
        }
        else {
            return Winner.COMPUTER;
        }
    }
}
