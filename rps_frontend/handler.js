const { appendFile } = require("fs");

document.addEventListener('DOMContentLoaded', () => {

  const rockButton = document.querySelector('#rock');
  rockButton.addEventListener('click', () => {
    updatePlayerChoice("rock");
  });

  const paperButton = document.querySelector('#paper');
  paperButton.addEventListener('click', () => {
    updatePlayerChoice("paper");
  });

  const scissorsButton = document.querySelector('#scissors');
  scissorsButton.addEventListener('click', () => {
    updatePlayerChoice("scissors");
  });

  const updatePlayerChoice = (playerChoice) => {
    const target = document.querySelector('#player-choice');
    target.innerHTML = playerChoice;
  }

});