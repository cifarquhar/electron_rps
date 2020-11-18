const { appendFile } = require("fs");

document.addEventListener('DOMContentLoaded', () => {
  
  const rockButton = document.querySelector('#rock');
  rockButton.addEventListener('click', () => {
    getResults("rock");
  });
  
  const paperButton = document.querySelector('#paper');
  paperButton.addEventListener('click', () => {
    getResults("paper");
  });
  
  const scissorsButton = document.querySelector('#scissors');
  scissorsButton.addEventListener('click', () => {
    getResults("scissors");
  });
  
  const updatePlayerChoice = (playerChoice) => {
    const target = document.querySelector('#player-choice');
    target.innerHTML = playerChoice;
  }

  const updateComputerChoice = (computerChoice) => {
    const target = document.querySelector('#computer-choice');
    target.innerHTML = computerChoice;
  } 

  const updateOutcome = (result) => {
    const target = document.querySelector('#result');

    let text 
    
    switch (result) {
      case "PLAYER":
        text = "wisely!"
        break;
      case "COMPUTER":
        text = "poorly."
        break;
      case "DRAW":
        text = "wisely (kind of)."
        break;
      default:
        break;
    }

    target.innerHTML = text;

  }
  
  const getResults = (playerChoice) => {
    const content = {
      playerChoice: playerChoice
    }
    
    fetch("http://localhost:8080/play", {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(content)
      }
    )
      .then(res => res.json())
      .then((data) => {
        updatePlayerChoice(playerChoice);
        updateComputerChoice(data.computerGuess);
        updateOutcome(data.winner);
      })
}

});