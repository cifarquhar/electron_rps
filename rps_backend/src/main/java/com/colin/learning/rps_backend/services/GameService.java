package com.colin.learning.rps_backend.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class GameService {

    private Random randomGenerator;
    private String[] options;

    public GameService() {
        this.randomGenerator = new Random();
        this.options = new String[]{"Rock", "Paper", "Scissors"};
    }

    public String getComputerChoice(){
        int index = randomGenerator.nextInt(3);
        return options[index];
    }
}
