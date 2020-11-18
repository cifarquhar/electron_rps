const { appendFile } = require("fs");

document.addEventListener('DOMContentLoaded', () => {

  const rockButton = document.querySelector('#rock');
  rockButton.addEventListener('click', () => {
    console.log("rock clicked");
  });

  const paperButton = document.querySelector('#paper');
  paperButton.addEventListener('click', () => {
    console.log("paper clicked");
  });

  const scissorsButton = document.querySelector('#scissors');
  scissorsButton.addEventListener('click', () => {
    console.log("scissors clicked");
  });

});