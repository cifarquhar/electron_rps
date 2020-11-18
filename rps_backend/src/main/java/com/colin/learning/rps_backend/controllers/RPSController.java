package com.colin.learning.rps_backend.controllers;

import com.colin.learning.rps_backend.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RPSController {

    @Autowired
    GameService gameService;

    @GetMapping("/play")
    public ResponseEntity<String> getComputerGuess(){
        String choice = gameService.getComputerChoice();
        return new ResponseEntity<>(choice, HttpStatus.OK);
    }

}
