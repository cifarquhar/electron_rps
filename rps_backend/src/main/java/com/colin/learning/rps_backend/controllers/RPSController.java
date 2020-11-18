package com.colin.learning.rps_backend.controllers;

import com.colin.learning.rps_backend.payloads.GameResult;
import com.colin.learning.rps_backend.payloads.PlayerSubmission;
import com.colin.learning.rps_backend.payloads.Winner;
import com.colin.learning.rps_backend.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class RPSController {

    @Autowired
    GameService gameService;

    @PostMapping("/play")
    public ResponseEntity<GameResult> getComputerGuess(@RequestBody PlayerSubmission playerSubmission){
        String playerChoice = playerSubmission.getPlayerChoice();
        String computerChoice = gameService.getComputerChoice();
        Winner winner = gameService.getWinner(playerChoice, computerChoice);
        GameResult result = new GameResult(computerChoice, winner);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
